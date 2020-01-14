package by.man.bot.requests;

import com.google.gson.Gson;




public class JsonToPojo {

	private static final JsonToPojo instance = new JsonToPojo();
	
	@SuppressWarnings("unchecked")
	public <T> Class<T> getJsonToPojo(Class<?> type, String string) {
		Gson gsonObj = new Gson();			
		return 	 (Class<T>) gsonObj.fromJson(string, type);	
	}
	public static JsonToPojo getInstance() {
		return instance;
	}
}
