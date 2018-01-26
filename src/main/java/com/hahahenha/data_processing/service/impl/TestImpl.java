package com.hahahenha.data_processing.service.impl;

import com.hahahenha.data_processing.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/26 0026
 * Time: 9:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class TestImpl implements TestService{
    @Override
    public Integer getRandomNumber() {
        return ((int) (Math.random()*100));
    }
}