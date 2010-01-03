package org.phone.web.validation;

import org.phone.persistence.bean.Phone;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class PhoneValidator {

	public void validate(Phone phone, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "NAME_REQUIRED", "Name is required.");
		ValidationUtils.rejectIfEmpty(errors, "phone", "PHONE_REQUIRED", "Phone is required.");
	}
}
