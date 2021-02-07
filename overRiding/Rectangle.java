package overRiding;

public class Rectangle extends Shape {
	public long length ,breath;
	
	public Rectangle(long length, long breath) {
		this.length = length;
		this.breath = breath;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length*this.breath;
	}
}
