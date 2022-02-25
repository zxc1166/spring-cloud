package com.qf.dao;

import com.qf.domian.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao {

    @Select("select * from db_user where uid = #{uid}")
    public Book getById(Integer id);
}
