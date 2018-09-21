
public class Cercle {
	private Point centre;
	private double rayon;
	
	public Cercle() {
		this.centre = new Point();
		this.rayon = 0;
	}
	
	public Cercle(double x, double y, double rayon) {
		this.centre = new Point(x, y);
		this.rayon = rayon;
	}
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public double getCentreX() {
		return centre.getX();
	}
	
	public double getCentreY() {
		return centre.getY();
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public double getCirconference() {
		return (2* Math.PI * rayon);
	}
	
	public double getAire() {
		return (Math.PI * (rayon * rayon));
	}
	
	public void afficherCercle() {
		System.out.println("Position du centre : ");
		centre.afficherPoint();
		System.out.println("Rayon du cerlce : " + rayon);
	}
}
