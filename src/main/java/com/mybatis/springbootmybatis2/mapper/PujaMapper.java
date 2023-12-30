package com.mybatis.springbootmybatis2.mapper;

import com.mybatis.springbootmybatis2.model.Puja;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PujaMapper {

   // @Select("SELECT * FROM puja")
    List<Puja> getAllPujas();

    //@Select("SELECT * FROM puja WHERE id = #{id}")
    Puja getPujaById(Integer id);

    //@Insert("INSERT INTO puja (name, rollno) VALUES (#{name}, #{rollno})")
   // @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertPuja(Puja puja);


   // @Update("UPDATE puja SET name = #{name}, rollno = #{rollno} WHERE id = #{id}")
    int updatePuja(Puja puja);

   // @Delete("DELETE FROM puja WHERE id = #{id}")
    int deletePuja(Integer id);
}
