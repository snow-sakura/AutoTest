package com.snow.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bedou
 * @version 1.0
 * @className: DemoApplication
 * @package: com.snow.code
 * @date: 2025/09/27 19:31
 * @description 测试官方Demo
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-27
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
