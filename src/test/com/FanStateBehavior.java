package test.com;

public class FanStateBehavior {

	private String make;
	private String color;
	private double radius;
	private byte speed;
	private boolean isOn;

	FanStateBehavior(String make, String color, double radius) {

		this.make = make;
		this.color = color;
		this.radius = radius;

	}

	public String toString() {

		return String.format("make-%s, color-%s, radius-%f, speed-%d, isOn-%b ", make, color, radius, speed, isOn);

	}

	public void swtichOn() {

		this.isOn = true;
		setSpeed((byte)5);
		
	}

	public void swtichOff() {

		this.isOn = false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
		
	}
	
	
	public static void main(String[] args) {
		FanStateBehavior run = new FanStateBehavior("cello", "black", 00.27);
		
		run.swtichOn();
		System.out.println(run);
		
		run.setSpeed((byte)3);
		System.out.println(run);
		
		run.swtichOff();
		System.out.println(run);
		
		
	}

}
