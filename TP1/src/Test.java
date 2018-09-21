
public class Test {

	public static void main(String[] args) {
		Point point1 = new Point();
		Point point2 = new Point(3, 7);
		
		Cercle cercle1 = new Cercle();
		Cercle cercle2 = new Cercle(point2, 6);
		
		point1.afficherPoint();
		point2.afficherPoint();
		cercle1.afficherCercle();
		cercle2.afficherCercle();
		
		System.out.println(point1.getX());
		System.out.println(point2.getX());
		
		System.out.println(cercle1.getCirconference());
		System.out.println(cercle2.getCirconference());
		System.out.println(cercle1.getAire());
		System.out.println(cercle2.getAire());
		
		point1.deplacerPoint(100, 100);
		point1.afficherPoint();
		
		Robot robot = new Robot("Jacques", 33, -12, Orientation.Ouest);
		robot.avancer(30);
		robot.tournerAGauche();
		robot.afficherPosition();
		robot.avancer();
		robot.tournerADroit();
		robot.afficherPosition();

	}

}
