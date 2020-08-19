package com.stu_safety.service;

import com.stu_safety.dao.CountDao;
import com.stu_safety.entity.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountService {

    @Autowired
    CountDao countDao;

    public List<Count> getListByOrder(){
        return countDao.getListByOrder();
    }
}
