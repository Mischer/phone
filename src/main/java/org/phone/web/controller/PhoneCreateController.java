package org.phone.web.controller;

import org.phone.persistence.bean.Phone;
import org.phone.persistence.dao.PhoneDao;
import org.phone.web.validation.PhoneValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("phone")
@RequestMapping("EDIT")
public class PhoneCreateController {

	private PhoneDao phoneDao;

	@Autowired
	public PhoneCreateController(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}

	@RequestMapping(value="/create", method=RequestMethod.GET)	// render phase
	public String showAddPhone(Model model) {
		if (!model.containsAttribute("phone")) {
			model.addAttribute("phone", new Phone());
		}
		return "phone/edit";
	}

	@RequestMapping(value="/create",method=RequestMethod.POST)	// action phase
	public String addPhone(@ModelAttribute("phone") Phone phone, BindingResult result, SessionStatus status) {
		new PhoneValidator().validate(phone, result);
		if (result.hasErrors()) {
			return "phone/edit";
		}else{
			phoneDao.create(phone);
			status.setComplete();
			return "redirect:/view?id="+phone.getId();
		}

	}

}
