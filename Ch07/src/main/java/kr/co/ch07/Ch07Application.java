package kr.co.ch07;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("kr.co.ch07.dao")
@SpringBootApplication
public class Ch07Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch07Application.class, args);
	}

}