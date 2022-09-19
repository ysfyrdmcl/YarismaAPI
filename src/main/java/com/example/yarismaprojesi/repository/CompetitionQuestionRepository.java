package com.example.yarismaprojesi.repository;

import com.example.yarismaprojesi.repository.entity.Competition;
import com.example.yarismaprojesi.repository.entity.CompetitionQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionQuestionRepository extends JpaRepository<CompetitionQuestions,Long> {
}
