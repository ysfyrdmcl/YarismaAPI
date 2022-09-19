package com.example.yarismaprojesi.repository;

import com.example.yarismaprojesi.repository.entity.Competition;
import com.example.yarismaprojesi.repository.entity.JoinState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinStateRepository extends JpaRepository<JoinState,Long> {
}
