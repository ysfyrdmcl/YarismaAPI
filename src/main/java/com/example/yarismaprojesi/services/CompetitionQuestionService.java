package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.CompetitionRepository;
import com.example.yarismaprojesi.repository.entity.Competition;
import org.springframework.stereotype.Service;

@Service
public class CompetitionQuestionService extends ServiceManager<Competition,Long> {
    private final CompetitionRepository competitionRepository;

    public CompetitionQuestionService(CompetitionRepository competitionRepository) {
        super(competitionRepository);
        this.competitionRepository = competitionRepository;
    }
}
