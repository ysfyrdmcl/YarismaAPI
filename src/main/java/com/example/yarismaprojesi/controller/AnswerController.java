package com.example.yarismaprojesi.controller;

import com.example.yarismaprojesi.dto.request.QuestionPackageDto;
import com.example.yarismaprojesi.services.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerService answerService;
    @PostMapping("/save")
    public ModelAndView saveAnswer(QuestionPackageDto dto){

        //answerService.save(dto);
        return  new ModelAndView("redirect:answer");
    }

}
