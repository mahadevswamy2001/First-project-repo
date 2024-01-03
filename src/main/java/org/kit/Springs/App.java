package org.kit.Springs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("project exicution Started===============>\n");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/kit/_07_beanLifeCycle.Exam/Config07.xml");   
    	System.out.println("project exicution Ended===============>");
	
    }
}
