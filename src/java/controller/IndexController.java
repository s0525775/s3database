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
 
@Controller
public class IndexController {
    private String viewName = "index";

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @RequestMapping("/index.htm")
    public ModelAndView Index(){
        String message = "S3 User Management";
        return new ModelAndView("index", "message", message);
    }
    
}