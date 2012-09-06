/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import validator.RegisterValidator;

/**
 *
 * @author s0525775
 */
@Controller
@RequestMapping("/register.htm")
public class RegisterController {
 
    RegisterValidator registerValidator;
    private String viewName = "register";

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @Autowired
    public RegisterController(RegisterValidator userValidator){
        this.registerValidator = userValidator;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
        @ModelAttribute("user") User user,
        BindingResult result, SessionStatus status) {

        registerValidator.validate(user, result);

        if (result.hasErrors()) {
            //if validator failed
            return "register";
        } else {
            status.setComplete();
            //form success
            return "resultregister";
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model){

        User user = new User();

        //command object
        model.addAttribute("user", user);

        //return form view
        return "register";
    }

}
