package com.snow.code.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @className: TestMethodDemo
 * @package: com.snow.code
 * @description: 测试报告
 * @author: bedou
 * @date: 2025/9/12 23:26
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class TestMethodDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我们自己的运行时异常");
    }
}
