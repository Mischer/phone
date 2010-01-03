package org.phone;

import org.phone.persistence.dao.PhoneDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ProcessManagerBean {
	
	@Autowired
	private PhoneDao phoneDao;
	
	public ProcessManagerBean() {
	}

}
