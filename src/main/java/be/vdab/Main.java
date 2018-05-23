package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("container.xml")) { 
		
			ClassA objectA = context.getBean("classA", ClassA.class);
			System.out.println(objectA.getBoodschap());
			System.out.println(context.getBean(InterfaceB.class).getBoodschap());
		}
	}

}
