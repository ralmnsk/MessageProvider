package by.my.message.provider;

import org.springframework.stereotype.Component;

@Component("oneProvider")
public class OneMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "One message Provider";
	}

}
