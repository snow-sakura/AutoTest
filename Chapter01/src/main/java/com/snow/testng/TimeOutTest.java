package com.snow.testng;

import org.testng.annotations.Test;

/**
 * @className: TimeOutTest
 * @package: com.snow.testng
 * @description: TestNG超时测试
 * @author: bedou
 * @date: 2025/9/12 22:40
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)//单位为毫秒值
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
