package com.snow.testng.multiThread;
import org.testng.annotations.Test;

/**
 * @className: MultiThreadOnXml
 * @package: com.snow.testng.multiThread
 * @description: TestNG多线程测试--Xml文件实现
 * @author: bedou
 * @date: 2025/9/12 22:19
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread ID : %s%n",Thread.currentThread().threadId());
    }

    @Test
    public void test2(){
        System.out.println(1);
        System.out.printf("Thread ID : %s%n",Thread.currentThread().threadId());
    }

    @Test
    public void test3(){
        System.out.println(1);
        System.out.printf("Thread ID : %s%n",Thread.currentThread().threadId());
    }
}
