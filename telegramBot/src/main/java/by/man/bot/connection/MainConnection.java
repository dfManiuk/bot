package by.man.bot.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class MainConnection {

	 private static final int CONNECTION_TIMEOUT = 5000;
	   
	    
	    public String postRequest(String urlInString)  {
	    	
	    	
	        URL url;
			HttpURLConnection con = null;
			String content = "";
		
			
			try {
				url = new URL(urlInString);	
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
				
			} catch (ProtocolException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} finally {
				 con.disconnect();
			}           
	        System.out.println(content);

			return content;
	        
	    }

	    public String readInputStream(HttpURLConnection con){
	   
	        try (BufferedReader  in = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
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
	    

		private String getStringfromStream(InputStream instream) {
			
			try {
				return IOUtils.toString(instream, StandardCharsets.UTF_8);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "null"; 

		}

	
	    
}
