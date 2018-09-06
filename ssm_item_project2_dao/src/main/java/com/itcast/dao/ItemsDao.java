package com.itcast.dao;

import com.itcast.service.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsDao {
    @Select("select * from items")
    public List<Items> findAll();

    /*@Insert("insert into items values(#{price,#{date},#{pic},#{createtime},#{detail}})")
    public void update(String price, String date, String pic, Date createtime, String detail);*/
}
