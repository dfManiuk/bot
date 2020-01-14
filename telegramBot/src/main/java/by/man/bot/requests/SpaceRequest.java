package by.man.bot.requests;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.google.gson.Gson;

import by.man.bot.connection.MainConnection;
import by.man.bot.connection.WeatherConnection;
import by.man.bot.entity.Example;
import by.man.bot.entity.space.Space;

public class SpaceRequest implements IRequest {

	@Override
	public String returnRequest(Update update) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SendMessage returnMessage(Update update, SendMessage sendMessage) {
		if (update.getMessage().getText().startsWith("/") && update.getMessage().getText() != null) {
			 String space = "No!";    
			 try { 
	        	  MainConnection connection = new MainConnection();     
	        	  space=  connection.postRequest("http://api.open-notify.org/iss-now.json");	
	        	  
	        	 Space spaceEntity = jsonToPojo(space);
	        	 
	        	 StringBuffer sb = new StringBuffer();
                 
                 sendMessage.setParseMode("HTML");
                 sb.append("<b>Международная космическая станция находится ")
                 .append(String.valueOf(spaceEntity.getIssPosition().getLatitude()))
                 .append(String.valueOf(spaceEntity.getIssPosition().getLongitude()));
                 
                 System.out.println(sb.toString());
                 
                 sendMessage.setText(sb.toString() );  
			 }catch (Exception e) {
				// TODO: handle exception
			}
		}
		return sendMessage;
		 
	}
	public Space jsonToPojo(String string) {
		Gson gsonObj = new Gson();	
		Space iSpace = gsonObj.fromJson(string, Space.class);		
		return iSpace;	
	}
}
