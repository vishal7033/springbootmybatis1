package com.mybatis.springbootmybatis2.mapper;

import com.mybatis.springbootmybatis2.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Usermapper {

//    @Select("SELECT u.*, p.name AS puja_name, p.rollno AS puja_rollno FROM user u LEFT JOIN puja p ON u.id = p.id")
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "name", column = "name"),
//            @Result(property = "sal", column = "sal"),
//            @Result(property = "puja.id", column = "puja_id"),
//            @Result(property = "puja.name", column = "puja_name"),
//            @Result(property = "puja.rollno", column = "puja_rollno")
//    })
    List<User> getAllUser();
    List<User> getAll();


    //@Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(Integer id);

    //@Insert("INSERT INTO user (name, sal) VALUES (#{name}, #{sal})")
    //@Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(User user);

    //@Update("UPDATE user SET name = #{name}, sal = #{sal} WHERE id = #{id}")
    int updateUser(User user);

    //@Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUser(Integer id);
}
