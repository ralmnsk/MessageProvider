package by.my.replacement.target.myexample;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;




public class Person {
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private int age;
	
	@Getter @Setter
	private String address;
	
	public void info() {
		System.out.println("name:"+this.name+" age:"+this.age);
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}*/
	
	

}
