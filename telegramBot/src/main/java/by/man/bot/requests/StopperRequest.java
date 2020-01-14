package by.man.bot.requests;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import com.google.gson.Gson;

import by.man.bot.connection.WeatherConnection;
import by.man.bot.connection.WeatherConnectionException;
import by.man.bot.entity.Example;

public class StopperRequest implements IRequest {

	@Override
	public String returnRequest(Update update) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SendMessage returnMessage(Update update, SendMessage sendMessage) {
		 if (update.getMessage().hasLocation() == true) {
      		 
	           	Location location = update.getMessage().getLocation();
	                  Float lat = location.getLatitude();
	                  Float lon = location.getLongitude();

	                   String weather = "No!";                   
	                   try { 
	                 	  WeatherConnection weatherConnection = new WeatherConnection();     
	                 	  weather=  weatherConnection.postRequest(lat,lon);	
	                 	  
	                 	 Example weatherEntity =  jsonToPojo(weather);
	                 	 
	                 //	 WatherConnectionIcone watherConnectionIcone = new WatherConnectionIcone();
	                 //	Image image= watherConnectionIcone.postRequest(weatherEntity.getData().get(0).getWeather().getIcon());
	                 //	System.out.println(image.toString());
	                 //	String icon = weatherEntity.getData().get(0).getWeather().getIcon();
	                    StringBuffer sb = new StringBuffer();
	                   
	                    sendMessage.setParseMode("HTML");
	                    sb.append("<b>Карта ")
	                    .append("</b>  ");
	                    
	                    
//	                    sendMessage.setParseMode("Markdown");
//	                   sb.append("[inline URL]").append("(").append(WeatherUrlInitializer.icon).append(icon).append(".png")
//	                    	.append(")");
	                    
	                   
	                    System.out.println(sb.toString());
	                    
	                    sendMessage.setText(sb.toString() );  

	    			} catch (WeatherConnectionException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	                   
	                   
	                   
				} else if (update.getMessage().getText().startsWith("/") && update.getMessage().getText() != null) {

			sendMessage.setText("You send /stopper");
			
			//Создаем клавиуатуру
	        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
	        sendMessage.setReplyMarkup(replyKeyboardMarkup);
	        replyKeyboardMarkup.setSelective(true);
	        replyKeyboardMarkup.setResizeKeyboard(true);
	        replyKeyboardMarkup.setOneTimeKeyboard(true);

	        // Создаем список строк клавиатуры
	        List<KeyboardRow> keyboard = new ArrayList<>();

	        // Первая строчка клавиатуры
	        KeyboardRow keyboardFirstRow = new KeyboardRow();
	        // Добавляем кнопки в первую строчку клавиатуры
	        KeyboardButton keyboardButton = new KeyboardButton();

	        keyboardButton.setText("Послать координаты >").setRequestLocation(true);  // setRequestContact(true);
	        keyboardFirstRow.add(keyboardButton);

	        // Добавляем все строчки клавиатуры в список
	        keyboard.add(keyboardFirstRow);
	        // и устанваливаем этот список нашей клавиатуре
	        replyKeyboardMarkup.setKeyboard(keyboard);

	        
			}
			 
	        return sendMessage;
		}
	
		public Example jsonToPojo(String string) {
			Gson gsonObj = new Gson();	
			Example weatherInfo = gsonObj.fromJson(string, Example.class);		
			return weatherInfo;	
	}

}
