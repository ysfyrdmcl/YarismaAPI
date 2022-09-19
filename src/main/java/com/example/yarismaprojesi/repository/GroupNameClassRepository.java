package com.example.yarismaprojesi.repository;

import com.example.yarismaprojesi.repository.entity.GroupNameClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupNameClassRepository extends JpaRepository<GroupNameClass,Long> {

}
