package test.com;

 class PersonStudent {
	 
private  String name;
private  String  email;
private  String  phoneNumber;


PersonStudent(){
	System.out.println("default constructor");
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String toString() {

	return String.format("Name :-[%s] \nEmail :-[%s]\nPhoneNumber :-[%s]\n",name,email,phoneNumber);

}

}

 class Student extends PersonStudent {
	
	 private  String collegeName;
	 private  int  collegeid;
	 
	 
	 public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	
}
 
 class Employee extends PersonStudent {
	 private String title;
	 private String employer;
	 private char employeeGrade;
	 private int salary;
	 
	 Employee(){
	
		 System.out.println("default constructor employee");
	 }
	 
	 public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {

		return String.format("Title :-[%s] \nEmployee Name :-[%s]\nEmployee Garde :-[%s]\n",title,employer,employeeGrade,salary);

	}
	 
	 
 }

