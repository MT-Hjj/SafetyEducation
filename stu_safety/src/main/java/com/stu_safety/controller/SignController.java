package com.stu_safety.controller;

import com.stu_safety.entity.Count;
import com.stu_safety.entity.Sign;
import com.stu_safety.service.CountService;
import com.stu_safety.service.SignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SignController {

    @Autowired
    SignService signService;

    @Autowired
    CountService countService;

    @ResponseBody
    @RequestMapping(value = {"/getIndexData"},method = RequestMethod.GET)
    public Map<String, Object> getList(String time){
        Map<String,Object> map = new HashMap<>();
        List<Sign> list1 = signService.getTodayList(time);
        List<Count> list2 = countService.getListByOrder();
        int totalCount = 0;
        int todayCount = 0;
        todayCount = signService.todayCount(time);
        totalCount = signService.totalCount();

        if (totalCount!=0) {
            map.put("msg","success");
            map.put("list1", list1);
            map.put("list2",list2);
            map.put("totalCount", totalCount);
            map.put("todayCount", todayCount);
            return map;
        }else {
            map.put("msg","error");
            return map;
        }
    }

    @ResponseBody
    @RequestMapping(value = {"/addList"},method = RequestMethod.GET)
    public Map<String,Object> addList(String name,String area,String time){
        Map<String,Object> map = new HashMap<>();
        int result1 = 0;
        int result2 = 0;
        result1 = signService.getListByNaAr(name,time);
        if(result1!=0){
            map.put("msg","signed");
        }else {
            result2= signService.addList(name,area,time);
            if(result2!=0){
                map.put("msg","success");
            }else {
                map.put("msg","error");
            }
        }
        return map;
    }
}
