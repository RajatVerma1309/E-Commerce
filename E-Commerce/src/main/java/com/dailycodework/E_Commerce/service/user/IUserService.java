package com.dailycodework.E_Commerce.service.user;

import com.dailycodework.E_Commerce.dto.UserDto;
import com.dailycodework.E_Commerce.model.User;
import com.dailycodework.E_Commerce.request.CreateUserRequest;
import com.dailycodework.E_Commerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
