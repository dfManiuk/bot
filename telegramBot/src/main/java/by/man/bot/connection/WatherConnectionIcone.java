package by.man.bot.connection;


import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Image;

public class WatherConnectionIcone {

	    public Image postRequest(String icons) throws WeatherConnectionException {
	    		    	
	    	StringBuffer sb = new StringBuffer(WeatherUrlInitializer.icon).append(icons).append(".png");

	    	Image image = null;
	        			
			try {
				URL url = new URL(sb.toString());	
				 image = ImageIO.read(url);
			
			} catch(IOException e) {
				e.printStackTrace();
				throw new WeatherConnectionException("Connection not impossible ore image not found", e);
			} 
			return image;
		}
}