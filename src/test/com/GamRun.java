package test.com;

public class GamRun {

	public static void main(String[] args) {
		
		GameBoard  run2 = new superman();    
//		GameBoard  run = new BoxGame();
		
//		superman run = new superman();
//		BoxGame run1 = new BoxGame();  
//		
		// polymorphism  
		run2.down();
		run2.left();
		run2.right();
		run2.up();
		
	}

}
