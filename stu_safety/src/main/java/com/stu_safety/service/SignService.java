package com.stu_safety.service;

import com.stu_safety.dao.SignDao;
import com.stu_safety.entity.Sign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SignService {

    @Autowired
    SignDao signDao;

//    public Map<String,Object> getIndexData(String time){
//        Map<String,Object> map = new HashMap<>();
//        List<Sign> list = signDao.getTodayList(time);
//        int totalCount = signDao.getAllCount();
//        int todayCount = signDao.getTodayCount(time);
//        int[] countArrays = new int[7];
//        countArrays[0] = signDao.getCountByarea("源城区");
//        countArrays[1] = signDao.getCountByarea("东源县");
//        countArrays[2] = signDao.getCountByarea("龙川县");
//        countArrays[3] = signDao.getCountByarea("紫金县");
//        countArrays[4] = signDao.getCountByarea("连平县");
//        countArrays[5] = signDao.getCountByarea("和平县");
//        countArrays[6] = signDao.getCountByarea("江东新区");
//        if (totalCount!=0) {
//            map.put("msg","success");
//            map.put("list", list);
//            map.put("totalCount", totalCount);
//            map.put("todayCount", todayCount);
//            map.put("countArrays",countArrays);
//        }else {
//            map.put("msg","error");
//        }
//        return map;
//    }

    public int addList(String name,String area,String time){
        int result = 0;
        Sign sign = new Sign();
        sign.setName(name);
        sign.setArea(area);
        sign.setTime(time);
        result = signDao.addList(sign);
        if(result!=0){
            return result;
        }
        return result;
    }

    public int getListByNaAr(String name,String time){
        int result = 0;
        result = signDao.getCountByNaAr(name,time);
        return result;
    }

    public List<Sign> getTodayList(String time){
        return signDao.getTodayList(time);
    }
    public int totalCount(){
        return signDao.getAllCount();
    }
    public int todayCount(String time){
        return signDao.getTodayCount(time);
    }
    public int getCountByarea(String area){
        return signDao.getCountByarea(area);
    }
}
