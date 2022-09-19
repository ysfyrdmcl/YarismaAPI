package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.RankingsRepository;
import com.example.yarismaprojesi.repository.entity.Rankings;
import org.springframework.stereotype.Service;

@Service
public class RankingService extends ServiceManager<Rankings,Long> {
    private final RankingsRepository rankingsRepository;

    public RankingService(RankingsRepository rankingsRepository) {
        super(rankingsRepository);
        this.rankingsRepository = rankingsRepository;
    }
}
