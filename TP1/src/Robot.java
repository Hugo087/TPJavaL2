
public class Robot {
	private String nom;
	private int x;
	private int y;
	private Orientation orientation;
	
	public Robot() {
		this.nom = "";
		this.x = 0;
		this.y = 0;
		this.orientation = Orientation.Nord;
	}
	
	public Robot(String nom, int x, int y, Orientation orientation) {
		this.nom = nom;
		this.x = x;
		this.y =y;
		this.orientation = orientation;
	}
	
	public Robot(Robot robot, String nom) {
		this.nom = nom;
		this.x = robot.x;
		this.y = robot.y;
		this.orientation = robot.orientation;
	}
	
	public void avancer() {
		switch(orientation) {
		case Nord:
			y++;
			break;
		case Est:
			x++;
			break;
		case Sud:
			y--;
			break;
		case Ouest:
			x--;
			break;
		}
	}
	
	public void avancer(int distance) {
		switch(orientation) {
		case Nord:
			y+= distance;
			break;
		case Est:
			x+= distance;
			break;
		case Sud:
			y-= distance;
			break;
		case Ouest:
			x-= distance;
			break;
		}
	}
	
	public void reculer() {
		switch(orientation) {
		case Nord:
			y--;
			break;
		case Est:
			x--;
			break;
		case Sud:
			y++;
			break;
		case Ouest:
			x++;
			break;
		}
	}
	
	public void reculer(int distance) {
		switch(orientation) {
		case Nord:
			y-= distance;
			break;
		case Est:
			x-= distance;
			break;
		case Sud:
			y+= distance;
			break;
		case Ouest:
			x+= distance;
			break;
		}
	}
	
	public void tournerADroit() {
		switch(orientation) {
		case Nord:
			this.orientation = Orientation.Est;
			break;
		case Est:
			this.orientation = Orientation.Sud;
			break;
		case Sud:
			this.orientation = Orientation.Ouest;
			break;
		case Ouest:
			this.orientation = Orientation.Nord;
			break;
		}
	}
	
	public void tournerAGauche() {
		switch(orientation) {
		case Nord:
			this.orientation = Orientation.Ouest;
			break;
		case Est:
			this.orientation = Orientation.Nord;
			break;
		case Sud:
			this.orientation = Orientation.Est;
			break;
		case Ouest:
			this.orientation = Orientation.Sud;
			break;
		}
	}
	
	public void afficherPosition() {
		System.out.println("Robot du nom de " + this.nom + " : ");
		System.out.println("Position en x : " + x);
		System.out.println("Position en y : " + y);
		System.out.println("Orientation du robot : " + this.orientation.getNomOrientation());
	}
}
