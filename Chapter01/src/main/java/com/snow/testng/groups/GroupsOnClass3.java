package com.snow.testng.groups;

import org.testng.annotations.Test;

/**
 * @className: GroupsOnClass3
 * @package: com.snow.testng.groups
 * @description: 类分组测试
 * @author: bedou
 * @date: 2025/9/12 21:04
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
