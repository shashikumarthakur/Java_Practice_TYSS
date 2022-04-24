package pojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) throws Exception, DatabindException, IOException {
		long[] phoneNumber= {907863,889666,445578};
	EmployeeDetails details=new EmployeeDetails("shashi","tys001",phoneNumber,"abc@gmail.com");
	
	ObjectMapper mapper=new ObjectMapper();
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./empDetails.json"),details);
	System.out.println("Json file created");
	

	}

}
