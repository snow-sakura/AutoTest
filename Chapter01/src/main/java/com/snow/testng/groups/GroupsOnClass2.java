package com.snow.testng.groups;

import org.testng.annotations.Test;

/**
 * @className: GroupsOnClass2
 * @package: com.snow.testng.groups
 * @description: 类分组测试
 * @author: bedou
 * @date: 2025/9/12 21:04
 * @version: 1.0
 * @copyright: Copyright (c) 2025 [Snow Sakura]
 */
@Test(groups = "student")
public class GroupsOnClass2 {

    public void student1(){
        System.out.println("GroupsOnClass2中的student111运行");
    }

    public void student2(){
        System.out.println("GroupsOnClass2中的student222运行");
    }
}
