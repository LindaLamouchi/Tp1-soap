package tp1_part2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



//@XmlType(name = "User")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	
	@XmlAttribute(name="username",required = true)
	private String username;
	@XmlAttribute(name="password",required = true)
	private String password;
public User() {
		
		
	}
	
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	//do not return password use an annotation to control what should be returned
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
