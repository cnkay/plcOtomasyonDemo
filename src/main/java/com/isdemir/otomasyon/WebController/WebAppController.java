package com.isdemir.otomasyon.WebController;



import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.memory.UserAttribute;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@Controller
public class WebAppController {
    @RequestMapping(value = "/user")
    public String userIndex(Principal principal){
        System.out.println(principal.getName());
       /* System.out.println(org.hibernate.Version.getVersionString());*/
        return "user/index";
    }
    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error){
        ModelAndView modelAndView = new ModelAndView();
        if (error != null) {
            modelAndView.setViewName("login?error");
        } else modelAndView.setViewName("login");

        return modelAndView;
    }
    @RequestMapping(value="/access-denied",method = RequestMethod.GET)
    public String accessDenied() {
        return "/error/access-denied";
    }
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }


}
