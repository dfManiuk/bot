package by.man.bot.requests;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;


public interface IRequest {

	public String returnRequest(Update update);
	
	public SendMessage returnMessage(Update update, SendMessage sendMessage);
}
