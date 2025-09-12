package com.snow.testng;

import org.testng.annotations.Test;

/**
 * @className: IgnoreTest
 * @package: com.snow.testng
 * @description: TestNG的忽略测试
 * @author: bedou
 * @date: 2025/9/12 20:56
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class IgnoreTest {
    @Test
    public void ignoreCase1(){
        System.out.println("ignoreCase1 执行啦");
    }

    @Test(enabled = false)
    public void ignoreCase2(){
        System.out.println("ignoreCase2 执行啦");
    }

    @Test(enabled = true)
    public void ignoreCase3(){
        System.out.println("ignoreCase3 执行啦");
    }
}
