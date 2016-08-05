package com.luke.cooking.controller;

import com.luke.cooking.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello() {
        System.out.println("lolololololol");
        return "html/hello";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "html/home";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete() {
        return "html/delete";
    }

    /*@RequestMapping("/list")
    public ModelAndView list() {
        Iterable<User> users = userRepository.findAll();
        return new ModelAndView("/users/list", "users", users);
    }

    @RequestMapping("/{id}")
    public ModelAndView view(@PathVariable("id") User user) {
        return new ModelAndView("users/view", "user", user);
    }

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(@ModelAttribute User user) {
        return "users/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView create(@Valid User user, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("users/form", "formErrors", result.getAllErrors());
        }
        user = this.userRepository.save(user);
        redirect.addFlashAttribute("globalMessage", "Successfully created a new user");
        return new ModelAndView("redirect:/{user.id}", "user.id", user.getId());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id") String id) {
        this.userRepository.delete(id);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ModelAndView modifyForm(@PathVariable("id") User user) {
        return new ModelAndView("users/form", "user", user);
    }*/

}
