package com.snow.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @className: DataProviderTest
 * @package: com.snow.testng.paramter
 * @description: TestNG参数化测试
 * @author: bedou
 * @date: 2025/9/12 22:00
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + "\n" + "age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name = " + name + "\n" + "age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name = " + name + "\n" + "age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20},
                    {"wangwu",30}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"zhaoliu",10},
                    {"qianqi",20},
                    {"liuba",30}
            };
        }
        return result;
    }
}
