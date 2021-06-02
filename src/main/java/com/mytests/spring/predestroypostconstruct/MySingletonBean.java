package com.mytests.spring.predestroypostconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MySingletonBean {

	public MySingletonBean() {
		System.out.println("MySingletonBean instance created");
	}

	@PostConstruct
	private void initbean() {
		System.out.println("MySingletonBean initializing completed");
	}

	@PreDestroy
	private void prepareBeanClosing() {
		System.out.println("Preparing to close MySingletonBean");
	}

	public void close() {
		System.out.println("Closing MySingletonBean");
	}
}