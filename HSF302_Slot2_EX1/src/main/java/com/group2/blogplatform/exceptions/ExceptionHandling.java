package com.group2.blogplatform.exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(PasswordWrongException.class)
    public ModelAndView handlePasswordWrongException(PasswordWrongException ex) {
        ModelAndView mv = new ModelAndView("view/auth/login");
        mv.addObject("errorMessage", ex.getMessage());
        return mv;
    }

    @ExceptionHandler(EmailExistException.class)
    public ModelAndView EmailExistException(EmailExistException ex) {
        ModelAndView mv = new ModelAndView("view/auth/register");
        mv.addObject("errorMessage", ex.getMessage());
        return mv;
    }
}