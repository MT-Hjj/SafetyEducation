package com.stu_safety.dao;

import com.stu_safety.entity.Count;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountDao {
    List<Count> getListByOrder();
    int addAreaCounts(String area);
}
