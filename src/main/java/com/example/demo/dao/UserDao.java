package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Insert("insert into user(username,password,createTime,updateTime,createUserId,updateUserId,deleteFlag) values(#{username},#{password},#{createTime},#{updateTime},#{createUserId},#{updateUserId},#{deleteFlag})")
    void addUser(User user);

    @Select("select * from flash where username=#{username}")
    User getUserByName(String username);

    @Delete("delete from flash where username=#{username}")
    void deleteUser(String user);

}
