package com.mytests.spring.predestroypostconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyPrototypeBean {

	public MyPrototypeBean() {
		System.out.println("MyPrototypeBean instance created");
	}

	@PostConstruct
	private void initbean() {
		System.out.println("MyPrototypeBean initializing completed");
	}

	@PreDestroy
	private void prepareBeanClosing() {
		System.out.println("Preparing to close MyPrototypeBean");
	}

	public void close() {
		System.out.println("Closing MyPrototypeBean");
	}
}