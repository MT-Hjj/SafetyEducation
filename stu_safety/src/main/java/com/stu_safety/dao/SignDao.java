package com.stu_safety.dao;

import com.stu_safety.entity.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SignDao {
    List<Sign> getAll();
    int getAllCount();
    int getTodayCount(@Param("time") String time);
    int addList(Sign sign);
    int getCountByarea(String area);
    List<Sign> getTodayList(@Param("time")String time);
    int getCountByNaAr(String name,String time);

}
