public class Triangle extends Shape{
	private float base;
	private float height;
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public double calculateArea() {
		return 0.5*base*height;
	}
}