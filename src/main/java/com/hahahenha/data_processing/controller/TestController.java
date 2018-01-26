package com.hahahenha.data_processing.controller;

import com.hahahenha.data_processing.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/26 0026
 * Time: 9:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController(value = "第一次测试")
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    TestService testService;
    @RequestMapping(value = "/getRandomNumber")
    public String getRandomNumber(@RequestParam(required = false) String param){
        System.out.println(param);
        return testService.getRandomNumber().toString();
    }

}