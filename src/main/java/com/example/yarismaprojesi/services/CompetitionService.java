package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.CompetitionRepository;
import com.example.yarismaprojesi.repository.entity.Competition;
import org.springframework.stereotype.Service;

@Service
public class CompetitionService extends ServiceManager<Competition,Long> {
    private final CompetitionRepository competitionRepository;

    public CompetitionService(CompetitionRepository competitionRepository) {
        super(competitionRepository);
        this.competitionRepository = competitionRepository;
    }
}
