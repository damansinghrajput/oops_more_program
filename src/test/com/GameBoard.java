package test.com;

public interface GameBoard {
	
	
	
public void up();
public void down();
public void right();
public void left();

}

class superman implements GameBoard {

	@Override
	public void up() {
		System.out.println("SuperMan goes Up");
		
	}

	@Override
	public void down() {
		
		System.out.println("SuperMan goes Down");
	}

	@Override
	public void right() {
		System.out.println("SuperMan goes Right");
		
	}

	@Override
	public void left() {
		System.out.println("SuperMan goes Left");
		
	}
	
	
}


class BoxGame  implements GameBoard{

	@Override
	public void up() {
		System.out.println(" Boxman  goes Up");
		
	}

	@Override
	public void down() {
		System.out.println(" Boxman  goes Down");
		
	}

	@Override
	public void right() {
		System.out.println(" Boxman  goes Right");
		
	}

	@Override
	public void left() {
		System.out.println(" Boxman  goes Down");
		
	}
	
	
}


