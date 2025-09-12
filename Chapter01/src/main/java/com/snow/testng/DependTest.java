package com.snow.testng;

import org.testng.annotations.Test;

/**
 * @className: DependTest
 * @package: com.snow.testng
 * @description: TestNG依赖测试
 * @author: bedou
 * @date: 2025/9/12 21:45
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
