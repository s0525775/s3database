/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author s0525775
 */
public class RegisterValidator implements Validator {
	@Override
	public boolean supports(Class cl) {
		//just validate the Customer instances
		return User.class.isAssignableFrom(cl);

	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"required.userName", "User name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "displayName",
				"required.displayName", "Display name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eMail",
				"required.eMail", "E-Mail address is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Password is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
				"required.confirmPassword", "Confirmed password is required.");

                User user = (User)target;
		
		if(!(user.getPassword().equals(user.getConfirmPassword()))) {
			errors.rejectValue("password", "nomatch.password");
		}
		
	}
    
}
