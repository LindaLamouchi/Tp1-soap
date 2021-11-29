package tp1_part2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAttribute;

@WebService(name="UserService")
public class Users {
	@XmlAttribute(name="users",required = true)
	List<User> users;

@WebMethod(operationName="findAll")
@WebResult(name="users")
public List<User> findUsers(){
return users;	
}
@WebMethod(operationName="addUser")
@WebResult(name="msg")
public String addUser(@WebParam(name = "username") String username,
		@WebParam(name = "password") String password){
	User u = new User(username, password);
	users.add(u);
	
	
	//for(User e : users) System.out.println(e.getPassword());
return "done";	
}


}
