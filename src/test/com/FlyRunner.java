package test.com;

interface Flyable {
	
	void fly();
	
	
}




class Bird  implements Flyable{

	@Override
	public void fly() {
		System.out.println("fly with wings");
		
	}
}


class Aeroplane implements Flyable{

	@Override
	public void fly() {
		
		System.out.println("fly with fuel");
	}
	
	
	
}




public class FlyRunner  {

	
	
	
	public static void main(String[] args) {
		Flyable [] fly = {new Bird() , new Aeroplane()};
		for(Flyable object : fly) {
			object.fly();
			
			
			
		}
		
		
		
		
		

	}


}
	

