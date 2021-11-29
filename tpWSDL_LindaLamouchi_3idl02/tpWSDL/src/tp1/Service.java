package tp1;

import javax.xml.ws.Endpoint;

public class Service {

	public static final String URL ="http://localhost:8500/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Loading ......");
		Endpoint.publish(URL, new Test());
	}

}
