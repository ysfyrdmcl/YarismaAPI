package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.ViewClassRepository;
import com.example.yarismaprojesi.repository.entity.ViewClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewClassService extends ServiceManager<ViewClass,Long> {
    private final ViewClassRepository viewClassRepository;

    public ViewClassService(ViewClassRepository viewClassRepository) {
        super(viewClassRepository);
        this.viewClassRepository = viewClassRepository;
    }
}
