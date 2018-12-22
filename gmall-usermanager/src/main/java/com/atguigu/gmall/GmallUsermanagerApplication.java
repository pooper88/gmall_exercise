package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.mapper")
public class GmallUsermanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUsermanagerApplication.class, args);
	}

}

