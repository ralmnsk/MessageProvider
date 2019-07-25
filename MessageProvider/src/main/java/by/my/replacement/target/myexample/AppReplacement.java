package by.my.replacement.target.myexample;

import org.springframework.context.support.GenericXmlApplicationContext;

import by.my.replacement.target.ReplacementTarget;

public class AppReplacement {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =new GenericXmlApplicationContext();
		ctx.load("myreplacement/context.xml");
		ctx.refresh();
		Person person=(Person)ctx.getBean("person");
		person.info();
		ctx.close();

	}

}
