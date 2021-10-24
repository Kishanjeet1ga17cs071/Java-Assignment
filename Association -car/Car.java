package Association;

public class Car {
	private String color ;
	private int speed ;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void CarDetails() {
		System.out.println("car color is "+" "+color+"  & "+"car speed is"+" "+speed);
	}
	

}
