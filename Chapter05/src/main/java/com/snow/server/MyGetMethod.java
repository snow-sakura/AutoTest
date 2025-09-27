package com.snow.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bedou
 * @version 1.0
 * @className: MyGetMethod
 * @package: com.snow.server
 * @date: 2025/09/27 20:04
 * @description Get方法类
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-27
 */
@RestController
public class MyGetMethod {
    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    public String getCookies(){
        return "恭喜你获得cookies信息成功";
    }
}
