package com.example.yarismaprojesi.controller;

import com.example.yarismaprojesi.dto.request.QuestionPackageDto;
import com.example.yarismaprojesi.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;
        @GetMapping("/save")
        public ModelAndView saveQuestion() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("userid", 1);
            modelAndView.setViewName("createquestion");
            return modelAndView;
        }
    //Hata alırsan bunu aç
    //@CrossOrigin
    @PostMapping("/save")
    public ModelAndView saveQuestion(@RequestBody QuestionPackageDto dto){
        questionService.save(dto);

        return  new ModelAndView("redirect:save");
    }
}
