package com.yc.blog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @SpringBootApplication  是复合注解
 * 		@SpringBootConfiguration
 *		@Configuration  纯注解配置方案的注解
 *		
 */
@SpringBootApplication
@Controller
@MapperScan("com.yc")
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	
	@GetMapping("hello")
	public String hello(){
		return "hello";
	}

}
