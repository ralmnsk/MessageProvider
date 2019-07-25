package by.my.replacement.target.myexample;

import lombok.*;
import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class InfoReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		Person person=(Person)obj;
		System.out.println("name:"+person.getName()+" age:"+person.getAge()+" address:"+person.getAddress());
		return null;
	}

}
