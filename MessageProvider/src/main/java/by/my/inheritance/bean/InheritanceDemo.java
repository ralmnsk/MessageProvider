package by.my.inheritance.bean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InheritanceDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("inherritance/context.xml");
		ctx.refresh();
		Singer singer=(Singer)ctx.getBean("parent");
		Singer child=(Singer)ctx.getBean("child");
		
		System.out.println(singer);
		System.out.println(child);
	}

}
