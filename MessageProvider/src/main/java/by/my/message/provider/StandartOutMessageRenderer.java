package by.my.message.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandartOutMessageRenderer implements MessageRenderer {
	private MessageProvider provider;
	@Override
	public void render() {
		if(provider!=null) {
			System.out.println(provider.getMessage());
		}else {
			System.out.println("You must set the property messageProvider");
		}
	}

	@Override
	@Autowired
	public void setMessageProvider(@Qualifier("oneProvider")MessageProvider provider) {
		this.provider=provider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		
		return this.provider;
	}

}
