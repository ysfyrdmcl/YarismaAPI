package com.example.yarismaprojesi.repository;

import com.example.yarismaprojesi.repository.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition,Long> {
}
