package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import com.example.demo.service.IGoodService;
import liquibase.util.MD5Util;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class loginController {
    @Autowired
    private UserDao userDao;
    private IGoodService goodService;

    @PostMapping("/register")
    public String loginVefify(User user){

//        Date date = new Date();
//        user.setCreateTime(date);
//        user.setUpdateTime(date);
//        user.setDeleteFlag(0);
//
//        String encryptPassword = MD5Util.computeMD5(user.getPassword());
//        user.setPassword(encryptPassword);
//
//        userDao.addUser(user);
//        System.out.println("user = [" + user + "]");
//        return "{\"status\":\"ok\"}";

        String message = goodService.addGoods(user);
        return message;
    }

    @GetMapping("/select")
    public User selectUser(String username){
        if (username == null){
            return null;
        }else {
            User user=userDao.getUserByName(username);
            return user;
        }
    }

    @DeleteMapping("/deletes")
    public String deleteUser(String username){
        userDao.deleteUser(username);
        return "{\"status\":\"ok\"}";
    }
}
