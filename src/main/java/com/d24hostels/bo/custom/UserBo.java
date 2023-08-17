package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.StudentDto;
import com.d24hostels.dto.UserDto;

public interface UserBo extends SuperBo {
    void saveUser(UserDto userDto) throws Exception;
    void updateUser(UserDto userDto) throws Exception;
    void deleteUser(String username) throws Exception;
    void getAllUsers() throws Exception;
    void searchUser(String username) throws Exception;
}
