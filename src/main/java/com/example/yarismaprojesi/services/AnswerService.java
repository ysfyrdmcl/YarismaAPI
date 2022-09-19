package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.dto.request.AnswerRequestDto;
import com.example.yarismaprojesi.dto.request.QuestionPackageDto;
import com.example.yarismaprojesi.dto.request.QuestionRequestDto;
import com.example.yarismaprojesi.repository.AnswerRepository;
import com.example.yarismaprojesi.repository.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnswerService extends ServiceManager<Answer,Long> {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        super(answerRepository);
        this.answerRepository = answerRepository;
    }

    public void save(List<AnswerRequestDto>dto,Long answerid){
        dto.stream().forEach(x->save(Answer.builder()
                .answer(x.getAnswer())
                .istrue(x.isIstrue())
                .questionid(answerid)
                .build()));

    }
}
