package com.snow.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @className: MultiThreadOnAnnotation
 * @package: com.snow.testng.multiThread
 * @description: TestNG多线程测试
 * @author: bedou
 * @date: 2025/9/12 22:14
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        //System.out.printf("Thread ID : %s%n",Thread.currentThread().threadId());
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
