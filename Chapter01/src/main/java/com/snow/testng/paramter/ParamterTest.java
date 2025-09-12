package com.snow.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @className: ParamterTest
 * @package: com.snow.testng.paramter
 * @description: TestNG参数化测试
 * @author: bedou
 * @date: 2025/9/12 21:51
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + "\n" + "age = " + age);
    }
}
