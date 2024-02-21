package test.com;




public abstract class MakePhone {
	
	public void iphone() {
	 getCalling(); 
	getMessage();     ///  non - abstract method in not logic ... onlu use for run method //
	
	
	
	}
	
	
	abstract void getCalling();           ///  ABstract method should be in child class 
	abstract void getMessage();     

}


class MakeIphone extends MakePhone{
	
	
	
	 void getCalling() {
		 
		 
		 
		 System.out.println("Make A Call");
	 }
	
	 void getMessage() {
		 System.out.println("Make A Message");
		 
	 }
	 
	 void emergeCall(int number) {
		 int police = 100;
		 if(number==police) {
			 
			 System.out.println("Call to police");
		 }
		 
		 else {
			 System.out.println("Number is wrong ");
		 }
		 
	 }
	 
	 void photoSendLimit(int number) {
		 int numberOfPhoto = 30;
		 if(number<numberOfPhoto) {
			 
			 System.out.println("Total "+number+" Photo Send");
		 }
		 
		 else {
			 System.out.println("You only send" +numberOfPhoto+ " Photo ");
			 
		 }
	 }
	 
	
	
}	
	
	
	
	
