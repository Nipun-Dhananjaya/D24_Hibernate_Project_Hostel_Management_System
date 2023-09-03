package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.UserBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.UserDao;
import com.d24hostels.dto.UserDto;
import com.d24hostels.entity.User;

public class UserBoImpl implements UserBo {
    UserDao userDao= (UserDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);
    @Override
    public void saveUser(UserDto userDto) throws Exception {
        userDao.save(new User(userDto.getUsername(), userDto.getPassword()));
    }

    @Override
    public void updateUser(UserDto userDto) throws Exception {

    }

    @Override
    public void deleteUser(String username) throws Exception {

    }

    @Override
    public void getAllUsers() throws Exception {

    }

    @Override
    public UserDto searchUser(String username) throws Exception {
        return null;
    }
}
