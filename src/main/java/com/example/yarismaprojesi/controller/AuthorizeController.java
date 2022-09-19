package com.example.yarismaprojesi.controller;

import com.example.yarismaprojesi.dto.request.RegisterRequestDto;
import com.example.yarismaprojesi.repository.entity.User;
import com.example.yarismaprojesi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("")
public class AuthorizeController {
    private final UserService userService;

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }
    // https://localhost:8080/v1/login
    // register
    // https://localhost:8080/v1/register
    // /register
    // https://localhost:8080/register
    @PostMapping("/register")
    public ModelAndView register(RegisterRequestDto dto){
        boolean isregister = userService.register(dto);
        ModelAndView model = new ModelAndView();
        if(isregister){
            model.setViewName("redirect:/login");
        }else{
            model.addObject("error",
                    "Kullanıcı adı daha önce alınmıştır");
            model.setViewName("register");
        }
        return model;
    }

    @PostMapping("/login")
    public ModelAndView login(String username,String password){
        Optional<User> userOptional =  userService.doLogin(username, password);
        ModelAndView modelAndView = new ModelAndView();
        if(userOptional.isEmpty()){
            modelAndView.addObject("error","Kullanıcı adı veya şifre hatalı");
            modelAndView.setViewName("login");
        }else{
            modelAndView.addObject("user",userOptional.get());
            modelAndView.setViewName("user");
        }
        return modelAndView;
    }
}
