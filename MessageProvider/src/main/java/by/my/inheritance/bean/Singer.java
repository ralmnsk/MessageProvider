package by.my.inheritance.bean;

import lombok.Setter;

@Setter
public class Singer {
	private String name;
	private int age;
	
	
	
	public String toString() {
		return "\tName: " + name + "\n\t" + "Age: " + age;
		}
}
