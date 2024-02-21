package test.com;

public class RectangleExe {
	private int length;
	private int width;
	
	RectangleExe(int length , int width){
		this.length = length;
		this.width = width;
		
		
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	int findArea() {
		
		return length*width;
	}

    int findPerimeter() {
		
		return 2* (length+width);
	}

	
	public String toString() {

		return String.format("length-%d,width-%d",findArea(),findPerimeter(),length,width);

	}
	 
	

	public static void main(String[] args) {
		RectangleExe run = new RectangleExe(5,6);
          System.out.println(run);
          
          
          run.setLength(6);
          System.out.println(run);
          
          run.setWidth(7);
          System.out.println(run);
	}

}
