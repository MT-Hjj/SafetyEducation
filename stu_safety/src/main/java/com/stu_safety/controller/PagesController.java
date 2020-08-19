package com.stu_safety.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PagesController {

    @RequestMapping(value = {"/index.html"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/test.html"},method = RequestMethod.GET)
    public String test(){
        return "test";
    }

    @RequestMapping(value = {"/news1.html"},method = RequestMethod.GET)
    public String news1(){
        return "news1";
    }

    @RequestMapping(value = {"/news2.html"},method = RequestMethod.GET)
    public String news2(){
        return "news2";
    }

    @RequestMapping(value = {"/news3.html"},method = RequestMethod.GET)
    public String news3(){
        return "news3";
    }

    @RequestMapping(value = {"/news4.html"},method = RequestMethod.GET)
    public String news4(){
        return "news4";
    }

    @RequestMapping(value = {"/news5.html"},method = RequestMethod.GET)
    public String news5(){
        return "news5";
    }

    @RequestMapping(value = {"/news6.html"},method = RequestMethod.GET)
    public String news6(){
        return "news6";
    }

    @RequestMapping(value = {"/news7.html"},method = RequestMethod.GET)
    public String news7(){
        return "news7";
    }

    @RequestMapping(value = {"/pic1.html"},method = RequestMethod.GET)
    public String pic1(){
        return "pic1";
    }

    @RequestMapping(value = {"/pic2.html"},method = RequestMethod.GET)
    public String pic2(){
        return "pic2";
    }

    @RequestMapping(value = {"/video1.html"},method = RequestMethod.GET)
    public String video1(){
        return "video1";
    }

    @RequestMapping(value = {"/video2.html"},method = RequestMethod.GET)
    public String video2(){
        return "video2";
    }

    @RequestMapping(value = {"/video3.html"},method = RequestMethod.GET)
    public String video3(){
        return "video3";
    }

    @RequestMapping(value = {"/video4.html"},method = RequestMethod.GET)
    public String video4(){
        return "video4";
    }

    @RequestMapping(value = {"/sign11.html"},method = RequestMethod.GET)
    public String sign11(){
        return "sign11";
    }
    @RequestMapping(value = {"/sign12.html"},method = RequestMethod.GET)
    public String sign12(){
        return "sign12";
    }
    @RequestMapping(value = {"/sign13.html"},method = RequestMethod.GET)
    public String sign13(){
        return "sign13";
    }

    @RequestMapping(value = {"/sign21.html"},method = RequestMethod.GET)
    public String sign21(){
        return "sign21";
    }
    @RequestMapping(value = {"/sign22.html"},method = RequestMethod.GET)
    public String sign22(){
        return "sign22";
    }
    @RequestMapping(value = {"/sign23.html"},method = RequestMethod.GET)
    public String sign23(){
        return "sign23";
    }

}
