package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Insert("insert into flash(username,password) values(#{username},#{password})")
    void addUser(User user);

    @Select("select * from flash where username=#{username}")
    User getUserByName(String username);

    @Delete("delete from flash where username=#{username}")
    void deleteUser(String user);

}
