package cn.cjc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启用自动配置:@EnableAutoConfiguration
 * springboot使用自动配置和starter这两个机制来简化配置
 *
 * @author debo
 * @date 2020-05-05
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
