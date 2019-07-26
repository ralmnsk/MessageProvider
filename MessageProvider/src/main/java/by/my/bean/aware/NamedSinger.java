package by.my.bean.aware;

import org.springframework.beans.factory.BeanNameAware;

public class NamedSinger implements BeanNameAware{
	private String name;
	
	public void setBeanName(String beanName) {
		this.name = beanName;
		}
	
	public void sing() {
		System.out.println("Singer " + name + " - sing()");
		}
}
