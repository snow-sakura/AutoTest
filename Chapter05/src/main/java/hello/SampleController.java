package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bedou
 * @version 1.0
 * @className: SampleController
 * @package: com.snow.code
 * @date: 2025/09/27 19:33
 * @description 历史版本Demo
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-27
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
