package by.my.message.provider;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
	public static void main(String...hi) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("app-contextannotation.xml");
		ctx.refresh();
		MessageRenderer messageRenderer=ctx.getBean("renderer",MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}
}
