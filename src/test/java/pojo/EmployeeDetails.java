package pojo;

public class EmployeeDetails {

	String name;
	String empID;
	long[] phoneNo;
	String emailID;
	String wife;
	//it is for Serialization
	public EmployeeDetails(String name, String empID, long[] phoneNo, String emailID) {
		super();
		this.name = name;
		this.empID = empID;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
	}
	public EmployeeDetails() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public long[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}

}
