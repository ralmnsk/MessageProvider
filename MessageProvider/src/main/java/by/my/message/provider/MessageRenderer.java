package by.my.message.provider;

public interface MessageRenderer {
	void render();
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
}
