package consumindowebservices.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;


public class teste {

	public static void main(String[] args)  {
		String url = "https://viacep.com.br/ws/57800000/json/";
		
			InputStreamReader reader;
			try {
				reader = new InputStreamReader(new URL("https://viacep.com.br/ws/57800970/json/").openStream());
				Cidades message = new Gson().fromJson(reader, Cidades.class);
				System.out.println(message);
				System.out.println(message.getIbge());

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

}
	}
