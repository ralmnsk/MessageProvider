package by.my.collects.lookup.anno;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractDemoBean implements DemoBean {
	
	@Lookup
	public abstract Singer getSinger();

	@Override
	public void doSomething() {
		getSinger().sing();
	}

}
