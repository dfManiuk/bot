package by.man.bot.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.springframework.context.annotation.Scope;


@Scope("singleton")
public class WeatherConnection {
	
    private static final int CONNECTION_TIMEOUT = 5000;
   
    
    public String postRequest(Float lat, Float longi) throws WeatherConnectionException {
    	
    	System.out.println(WeatherUrlInitializer.connectionUrl + "              j            " + WeatherUrlInitializer.connectionApiKey);
    	
    	StringBuffer sb = new StringBuffer(WeatherUrlInitializer.connectionUrl);
    	String latitud = String.valueOf(lat).substring(0,4);
    	String langitud = String.valueOf(longi).substring(0,4);
    	sb.append("lat=").append(latitud).append("&lon=").append(langitud).append("&key=").append(WeatherUrlInitializer.connectionApiKey)
    	.append("&lang=ru");
    	
        URL url;
		HttpURLConnection con = null;
		String content = "";
		
		try {
		//	url = new URL("https://api.weatherbit.io/v2.0/current?&lat=53.89&lon=27.52&key=80dc057a1fbc406bbb2a83300fdf9ee3");
			url = new URL(sb.toString());	
			con = (HttpURLConnection) url.openConnection();
	        con.setRequestMethod("POST");
	        con.setConnectTimeout(CONNECTION_TIMEOUT);
	        con.setReadTimeout(CONNECTION_TIMEOUT);
	        con.setDoOutput(true);
	        DataOutputStream out = new DataOutputStream(con.getOutputStream());
	        out.flush();
	        out.close();
	        content = readInputStream(con);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new WeatherConnectionException("URL not connection ", e);		
		} catch (ProtocolException e) {
			e.printStackTrace();
			throw new WeatherConnectionException("URL not connection ", e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new WeatherConnectionException("URL not connection ", e); //TODO 
		} finally {
			 con.disconnect();
		}           
        System.out.println(content);

		return content;
        
    }

    public String readInputStream(HttpURLConnection con){
   
        try (BufferedReader  in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
            return "";
        } 
    }
    

}
