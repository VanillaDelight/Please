package com.springbook.biz.common;

public class Log4jAdvice {
	public void printLogging() {
		System.out.println("[get 선택 로구-Log4j] 비즈니스 로직 수행 전 동작");
	}
	public void log() {
		System.out.println("[공통 로구-Log4j] 비즈니스 로직 수행 전 동작");
	}
}
