package com.snow.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit运行啦");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suit运行啦");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest运行啦");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest运行啦");
    }
}
