import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author bedou
 * @version 1.0
 * @className: Application
 * @package: PACKAGE_NAME
 * @date: 2025/09/27 20:02
 * @description 主程序
 * @copyright: Copyright (c) 2025 [AutoTest]
 * @since 2025-09-27
 */
@SpringBootApplication
@ComponentScan("com.snow.server")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
