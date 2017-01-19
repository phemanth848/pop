package com.web.registration.formvalidator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.web.registration.bean.UserInfo;

@Component
public class FormValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return UserInfo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object form, Errors errors) {
		UserInfo info=(UserInfo) form;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name" , "Name is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password" , "password is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.userInfo.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "NotEmpty.userInfo.dob");
		
	}

}
