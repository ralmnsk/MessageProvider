package by.my.message.provider.BeanFactoryImpl;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr=new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new ClassPathResource("xml_bean_factory_conf.xml"));
		Oracle oracle=(Oracle)factory.getBean("oracle");
		System.out.println(oracle.defineMeaningOfLife());
	}

}
