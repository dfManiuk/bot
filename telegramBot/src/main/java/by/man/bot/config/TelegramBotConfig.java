package by.man.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import by.man.bot.main.TelegramBot;


@Configuration
public class TelegramBotConfig {

	public TelegramBotConfig() {
		initBot();
	}
	
	private void initBot(){
        ApiContextInitializer.init();
  }
	
	@Bean
	public void setTelegramBotsApi() {
		try {
			new TelegramBotsApi().registerBot(new TelegramBot());
		} catch (TelegramApiRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
