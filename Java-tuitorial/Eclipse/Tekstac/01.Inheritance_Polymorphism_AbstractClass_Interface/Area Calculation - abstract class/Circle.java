public class Circle extends Shape{
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public Circle(float radius) {
		this.radius = radius;
	}
}