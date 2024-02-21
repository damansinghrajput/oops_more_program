package test.com;

public class CustomerRun {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("C-2,307","Gandhinagar","382721");
		Customer customer = new Customer("daman",homeAddress);
		
		Address workAddress = new Address("Pushpak No-21","Gandhinagar","382721");
		customer.setWorkAddress(workAddress);
		 
		Address homeAddress1 = new Address("222","kalol0","526535");
				customer.setHomeAddress(homeAddress1);

		
         System.out.println(customer);
         
//         System.out.println(customer.toString());
        
	}

}
