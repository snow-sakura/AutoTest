package com.snow.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase001(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase002(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest是在测试之前运行的");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest是在测试之后运行的");
    }

    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("BeforeSuit是在测试套件之前运行的");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite是在测试套件之后运行的");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass是在类运行之前运行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass是在类运行之后运行的方法");
    }

    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("这是在BeforeGroups前执行的测试用例");
    }

    @AfterGroups
    public void AfterGroups(){
        System.out.println("这是在AfterGroups后执行的测试用例");
    }
}
