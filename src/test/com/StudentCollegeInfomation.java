package test.com;

public class StudentCollegeInfomation  {

	public static void main(String[] args) {
		Student run = new Student();
		
		run.setName("Daman Singh Rajput");
		run.setEmail("damansinghrajput@247");
		run.setPhoneNumber("7990981130");
		
		
		run.setCollegeName("kirc Campus");
		run.setCollegeid(2247);
		
		System.out.println("Name :"+run.getName());
		System.out.println("Email :"+run.getEmail());
		System.out.println("PhoneNumber :"+run.getPhoneNumber());
		System.out.println("College Name :"+ run.getCollegeName());
		System.out.println("College ID :"+ run.getCollegeid());
	}

}
