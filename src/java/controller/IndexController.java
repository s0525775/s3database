/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author s0525775
 */
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class IndexController {
    private String viewName = "index";

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @RequestMapping("/index")
    public ModelAndView Index(){
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("index", "message", message);
    }
    
}