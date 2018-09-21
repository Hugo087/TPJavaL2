
public enum Orientation {
	Nord(0, "Nord"),
	Est(1, "Est"),
	Sud(2, "Sud"),
	Ouest(3, "Ouest");
	
	private int orientation;
	private String nomOrientation;
	
	Orientation(int orientation, String nomOrientation){
		this.orientation = orientation;
		this.nomOrientation = nomOrientation;
	}
	
	public int getOrientation() {
		return this.orientation;
	}
	
	public String getNomOrientation() {
		return this.nomOrientation;
	}
}
