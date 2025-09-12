package com.snow.testng;

import org.testng.annotations.Test;

/**
 * @className: ExpectedExceptiion
 * @package: com.snow.testng
 * @description: TestNG异常测试
 * @author: bedou
 * @date: 2025/9/12 21:38
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
public class ExpectedExceptiion {
    /**
     * 什么时候会用到异常测试？
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 预期结果就是异常
     */
    //这是一个预期结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个预期结果成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
