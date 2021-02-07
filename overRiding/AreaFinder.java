package overRiding;

public class AreaFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(4);
		Shape rectangle = new Rectangle(4,5);
		
		System.out.println(circle.area());
		System.out.println(rectangle.area());
	}

}
