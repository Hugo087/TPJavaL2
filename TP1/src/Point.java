
public class Point {
	private double x;
	private double y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void deplacerPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void afficherPoint() {
		System.out.println("Position en x : " + x);
		System.out.println("Position en y : " + y);
	}
}
