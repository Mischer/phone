package org.phone.web.controller;

import org.phone.persistence.dao.PhoneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhoneListController {

	private PhoneDao phoneDao;

	@Autowired
	public PhoneListController(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}

	@RequestMapping("/list")
	public String showListPhone(Model model) {
		System.out.println(" Open public String showListPhone(Model model)");
		model.addAttribute("listPhone", phoneDao.getAll());
		return "phone/list";
	}

	@RequestMapping(value = "/searh")
	public String search(@RequestParam(value = "stext", required = false) String stext, Model model) {
		model.addAttribute("listPhone", phoneDao.search(stext != null ? stext : ""));
		return "phone/list";
	}

	@RequestMapping(value = "/view",method=RequestMethod.GET)
	public String view(
			@RequestParam(value = "id", required = true) Long id, Model model) {
		model.addAttribute("phone", phoneDao.get(id));
		return "phone/view";
	}

}
