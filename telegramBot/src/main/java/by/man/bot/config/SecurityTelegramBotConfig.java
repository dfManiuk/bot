package by.man.bot.config;

public class SecurityTelegramBotConfig {
	private SecurityTelegramBotConfig() {
	}
	private static final String botUserName ="di13man_bot";
	private static final String token = "1060675804:AAHUrUzb8nKGYE_n9RpEFzuY22LYkjQ7YmE";
	
	public static String getBotusername() {
		return botUserName;
	}
	public static String getToken() {
		return token;
	}
}
