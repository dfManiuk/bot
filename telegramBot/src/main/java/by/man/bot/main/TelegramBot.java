package by.man.bot.main;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import by.man.bot.config.SecurityTelegramBotConfig;
import by.man.bot.controll.TelegramRequestInicializer;


public class TelegramBot extends TelegramLongPollingBot{
	
	@Override
	public void onUpdateReceived(Update update) {
		SendMessage request = new SendMessage().setChatId(update.getMessage()
											   .getChatId())
				                               .setText("Не обработанное сообщение");
		
		TelegramRequestInicializer telegramRequest = new TelegramRequestInicializer(update);
			
		request = telegramRequest.getSendMessage();
				
		
		
		try {
			this.execute(request);

		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String getBotUsername() {
		return SecurityTelegramBotConfig.getBotusername();
	}

	@Override
	public String getBotToken() {
		return SecurityTelegramBotConfig.getToken();
	}

}
