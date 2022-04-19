package com.totalplay.requerimiento;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.totalplay.requerimiento")
public class ArquetupeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquetupeApplication.class, args);
	}

}
