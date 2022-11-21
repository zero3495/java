package ch06.lab12;

public class Car {
	int speed;
	double hour;
	public Car(int speed, double hour) {
		this.speed = speed;
		this.hour = hour;
	}
	public Car(double hour) {
		this(60,hour);	
	}
	public Car() {
		this(0,0);
	}
	public void getComment() {
		System.out.println("此車走了" + speed * hour + "公里");
	}
}
