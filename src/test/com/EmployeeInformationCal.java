package test.com;

public class EmployeeInformationCal {

	public static void main(String[] args) {
		Employee run = new Employee();
		run.setName("Daman Singh Rajput");
		run.setEmail("damansinghrajput@247");
		run.setPhoneNumber("7990981130");
		run.setEmployer("Daman Singh Rajput");
		run.setTitle("Software Developer");
		run.setEmployeeGrade('A');
		run.setSalary(15000);
		
		System.out.println("Information About Techxplore Employer !");
		System.out.println(run);
		
		
		
		
//		System.out.println("Name :"+run.getName());
//		System.out.println("Email :"+run.getEmail());
//		System.out.println("PhoneNumber :"+run.getPhoneNumber());
//		System.out.println("Employer Name :"+run.getEmployer());
//		System.out.println("Title :"+run.getTitle());
//		System.out.println("Employee Garde :"+run.getEmployeeGrade());
//		System.out.println("Salary :"+run.getSalary());
	}

}
