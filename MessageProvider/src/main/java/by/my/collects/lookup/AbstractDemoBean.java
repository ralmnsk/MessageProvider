package by.my.collects.lookup;

public abstract class AbstractDemoBean implements DemoBean {
	public abstract Singer getSinger();

	@Override
	public void doSomething() {
		getSinger().sing();
	}

}
