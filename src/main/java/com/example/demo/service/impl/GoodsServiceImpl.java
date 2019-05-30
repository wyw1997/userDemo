package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import com.example.demo.service.IGoodService;
import liquibase.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Service
public class GoodsServiceImpl implements IGoodService {
    @Autowired
    private UserDao userDao;

    @Override
    public String addGoods(User user) {

        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdateTime(date);
        user.setDeleteFlag(0);

        String encryptPassword = MD5Util.computeMD5(user.getPassword());
        user.setPassword(encryptPassword);

        userDao.addUser(user);
        System.out.println("user = [" + user + "]");
        return "{\"status\":\"ok\"}";
    }
}