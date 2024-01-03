package org.kit._07_beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project exicution Started===============>");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"org/kit/_07_beanLifeCycle/Config07.xml");
		context.registerShutdownHook();
		// regesterShutdownHook use to destroy the connection

		Exam e = context.getBean("exm", Exam.class);
		System.out.println(e);
	}

}
