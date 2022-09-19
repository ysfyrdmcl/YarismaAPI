package com.example.yarismaprojesi.services;

import com.example.yarismaprojesi.repository.GroupNameClassRepository;
import com.example.yarismaprojesi.repository.entity.GroupNameClass;
import org.springframework.stereotype.Service;

@Service
public class GroupNameClassService extends ServiceManager<GroupNameClass,Long> {
    private final GroupNameClassRepository groupNameClassRepository;

    public GroupNameClassService(GroupNameClassRepository groupNameClassRepository) {
        super(groupNameClassRepository);
        this.groupNameClassRepository = groupNameClassRepository;
    }
}
