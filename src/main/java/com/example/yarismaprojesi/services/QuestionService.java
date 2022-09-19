package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.dto.request.AnswerRequestDto;
import com.example.yarismaprojesi.dto.request.QuestionPackageDto;
import com.example.yarismaprojesi.dto.request.QuestionRequestDto;
import com.example.yarismaprojesi.repository.AnswerRepository;
import com.example.yarismaprojesi.repository.QuestionRepository;
import com.example.yarismaprojesi.repository.entity.Answer;
import com.example.yarismaprojesi.repository.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService extends ServiceManager<Question,Long> {
    private final QuestionRepository questionRepository;
    private final AnswerService answerService;

    public QuestionService(QuestionRepository questionRepository,AnswerService answerService) {
        super(questionRepository);
        this.questionRepository = questionRepository;
        this.answerService=answerService;
    }

    public void save(QuestionPackageDto questionPackageDto){
        QuestionRequestDto questionRequestDto = questionPackageDto.getQue();
        List<AnswerRequestDto> answerRequestDtolist= questionPackageDto.getAnswers();
//        if(questionRequestDto.getQuestion()==null){
//
//        }
        Question question = Question.builder()
                .question(questionRequestDto.getQuestion())
                .createdByUserId(questionRequestDto.getCreatedByUserId())
                .howManyOption(answerRequestDtolist.size())
                .questiontime(questionRequestDto.getQuestiontime())
                .build();
        save(question);

        answerService.save(answerRequestDtolist,question.getId());


    }
}
