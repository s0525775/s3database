/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AWSUser;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import validator.LoginValidator;

/**
 *
 * @author s0525775
 */
@Controller
@RequestMapping("/login.htm")
public class LoginController {
  
    LoginValidator loginValidator;
    private String viewName = "login";

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @Autowired
    public LoginController(LoginValidator loginValidator){
        this.loginValidator = loginValidator;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
        @ModelAttribute("user") User user,
        BindingResult result, SessionStatus status) {

        loginValidator.validate(user, result);

        if (result.hasErrors()) {
            //if validator failed
            return "login";
        } else {
            status.setComplete();
            //form success
            return "resultlogin";
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model){

        User user = new User();
        AWSUser awsuser = new AWSUser();

        //command object
        model.addAttribute("user", user);
        model.addAttribute("awsuser", awsuser);

        //return form view
        return "login";
    }

}
