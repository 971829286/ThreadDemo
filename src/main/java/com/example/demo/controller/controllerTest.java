package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
public class controllerTest {

    @Resource
    protected HttpServletRequest request;

    @ResponseBody
    @PostMapping(value="authentication",produces = "application/json")
    public String getString() throws IOException {

        System.out.println("进入=====================");

        //后台接收

        InputStreamReader reader=new InputStreamReader(request.getInputStream(),"UTF-8");

        char [] buff=new char[1024];

        int length=0;

        while((length=reader.read(buff))!=-1){

            String x=new String(buff,0,length);

            System.out.println(x);

        }

        //响应

        Map<String,Object> jsonObject = new HashMap<>(); //创建Json对象
        jsonObject.put("username", "张三");     //设置Json对象的属性
        jsonObject.put("password", "123456");
        System.out.println("进入111=====================");

        return "进入11=====================";

    }

    @GetMapping("start")
    @ResponseBody
    public String start(){
        return "1";
    }
}