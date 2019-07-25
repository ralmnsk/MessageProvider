package by.my.collects.lookup;

public class StandartLookupDemoBean implements DemoBean {
	private Singer singer;
	
	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	@Override
	public Singer getSinger() {
		return this.singer;
	}

	@Override
	public void doSomething() {
		getSinger().sing();
		System.out.println("method in"+this.getClass()+" doSomething");
	}

}
