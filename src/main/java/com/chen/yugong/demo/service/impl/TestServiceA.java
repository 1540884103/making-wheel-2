package com.chen.yugong.demo.service.impl;

import com.chen.yugong.framework.spring.annotation.Autowired;
import com.chen.yugong.framework.spring.annotation.Service;

/**
 * @author 陈添明
 * @date 2019/6/4
 */
@Service
public class TestServiceA {


    @Autowired
    TestServiceB testServiceB;


    public void methodA() {
        System.out.println("TestServiceA => methodA");
        testServiceB.methodA();
    }

    public void methodB() {
        System.out.println("TestServiceA => methodB");
    }
}