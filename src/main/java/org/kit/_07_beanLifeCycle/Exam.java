package org.kit._07_beanLifeCycle;

public class Exam {
	private String subject;
	private int marks;

	public Exam(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}

	public void init() {
		System.out.println("Object will created===>");
	}

	public void distroy() {
		System.out.println("Object will distroyed====>");
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", marks=" + marks + "]";
	}

	
}
