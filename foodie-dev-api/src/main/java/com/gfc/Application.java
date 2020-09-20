package com.gfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/19 1:21 上午
 */
@SpringBootApplication
//扫描mybatis通用mapper所在的包
@MapperScan(basePackages = "com.gfc.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
