package com.d24hostels.dao.custom.Impl;

import com.d24hostels.dao.custom.UserDao;
import com.d24hostels.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean save(User entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(User entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public User search(String s) throws Exception {
        return null;
    }
}
