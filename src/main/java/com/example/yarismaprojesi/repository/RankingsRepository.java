package com.example.yarismaprojesi.repository;

import com.example.yarismaprojesi.repository.entity.Rankings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingsRepository extends JpaRepository<Rankings,Long> {
}
