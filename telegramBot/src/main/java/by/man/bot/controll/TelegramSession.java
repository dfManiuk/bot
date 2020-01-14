package by.man.bot.controll;

import java.util.concurrent.ConcurrentHashMap;
import org.telegram.telegrambots.meta.api.objects.Update;


public class TelegramSession {
	
	private static final  ConcurrentHashMap<String, Update> attribute = new ConcurrentHashMap<String, Update>();
	
	private TelegramSession() {
		
	}
	
	

    public static ConcurrentHashMap<String, Update> getAttribute() {
        return attribute;
    }
    
}
