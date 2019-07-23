package by.my.message.provider;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World Message Provider!!!";
	}

}
