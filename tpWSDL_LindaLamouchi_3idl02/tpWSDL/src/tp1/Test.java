package tp1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="CalculatorService")
public class Test {

	@WebMethod(operationName="text")
	public String hello() {
		return "Hello World!";
	}
	
	@WebMethod(operationName="add")
	@WebResult(name="addResult")
	public int add(@WebParam(name = "a") int a, @WebParam(name = "b")int b) {
		return a+b;
	}
	
	
	@WebMethod(operationName="subtract")
	@WebResult(name="subtractResult")
	public int subtract(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
		return a-b;
	}
	
	@WebMethod(operationName="mult")
	@WebResult(name="multResult")
	public int mult(@WebParam(name = "a") int a, @WebParam(name = "b")int b) {
		return a*b;
	}
	
	@WebMethod(operationName="div")
	@WebResult(name="divResult")
	public double div(@WebParam(name = "a") int a, @WebParam(name = "b")int b) {
		return a/b;
	}
	
}
