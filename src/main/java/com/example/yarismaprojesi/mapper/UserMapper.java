package com.example.yarismaprojesi.mapper;

import com.example.yarismaprojesi.dto.request.RegisterRequestDto;
import com.example.yarismaprojesi.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
    User toUser(RegisterRequestDto dto);
}
