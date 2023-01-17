package kr.co.ch10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j //심플로그퍼사드포자바 *시스템출력 ㄴㄴ 무조건 로그 출력
@Controller
public class SubController {
	
	@GetMapping("/sub/hello")
	public String hello() {
		log.trace("hello trace 로그...");
		log.debug("hello debug 로그...");
		log.info("hello info 로그...");
		log.warn("hello warn 로그...");
		log.error("hello error 로그...");
		return "/sub/hello";
	}
	
	@GetMapping("/sub/welcome")
	public String welcome() {
		log.trace("welcome trace 로그...");
		log.debug("welcome debug 로그...");
		log.info("welcome info 로그...");
		log.warn("welcome warn 로그...");
		log.error("welcome error 로그...");
		return "/sub/welcome";
	}
	
	@GetMapping("/sub/greeting")
	public String greeting() {
		log.trace("greeting trace 로그...");
		log.debug("greeting debug 로그...");
		log.info("greeting info 로그...");
		log.warn("greeting warn 로그...");
		log.error("greeting error 로그...");
		return "/sub/greeting";
	}

}
