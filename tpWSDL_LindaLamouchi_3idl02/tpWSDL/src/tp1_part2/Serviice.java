package tp1_part2;


import javax.xml.ws.Endpoint;




public class Serviice {
public static final String URL ="http://localhost:8501/";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Loading ......");
		Endpoint.publish(URL, new Users());
	}
}
