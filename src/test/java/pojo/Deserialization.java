package pojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {
	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper mapper=new ObjectMapper();
		EmployeeDetails details=mapper.readValue(new File("./empDetails.json"), EmployeeDetails.class);
		
		System.out.println(details.getName());;
		System.out.println(details.getWife());
	}

}
