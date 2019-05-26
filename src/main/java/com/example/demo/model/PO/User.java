package com.example.demo.model.PO;

import com.example.demo.model.PO.base.BaseEntity;
import lombok.Data;
import lombok.val;

@Data
public class User extends BaseEntity {
    private String username;
    private String password;

    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        user.getUsername();
    }
}
