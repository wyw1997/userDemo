package com.example.demo.model.PO.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private int id;
    private Date createTime;
    private Date updateTime;
    private int createUserId;
    private int updateUserId;
    private int deleteFlag;//0表示什么都没有

}
