package by.my.collects.lookup.anno;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LookupDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("lookupAnno/context.xml");
		ctx.refresh();
			DemoBean abstractDemoBean=ctx.getBean("abstractDemoBean", DemoBean.class);
			//DemoBean standartDemoBean=ctx.getBean("standartLookupBean", DemoBean.class);
			abstractDemoBean.doSomething();
			//standartDemoBean.doSomething();
		ctx.close();
	}

}
