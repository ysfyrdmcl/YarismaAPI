package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.JoinStateRepository;
import com.example.yarismaprojesi.repository.entity.JoinState;

import org.springframework.stereotype.Service;

@Service
public class JoinStateService extends ServiceManager<JoinState,Long> {
    private final JoinStateRepository joinStateRepository;

    public JoinStateService(JoinStateRepository joinStateRepository) {
        super(joinStateRepository);
        this.joinStateRepository=joinStateRepository;
    }
}
