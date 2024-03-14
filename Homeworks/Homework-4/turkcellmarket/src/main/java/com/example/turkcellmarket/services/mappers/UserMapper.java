package com.example.turkcellmarket.services.mappers;

import com.example.turkcellmarket.entities.User;
import com.example.turkcellmarket.services.dtos.requests.UserAddRequest;
import com.example.turkcellmarket.services.dtos.responses.UserGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userFromAddRequest(UserAddRequest request);

    @Mapping(source = "name", target = "name")
    UserGetResponse userToGetResponse(User user);
}
