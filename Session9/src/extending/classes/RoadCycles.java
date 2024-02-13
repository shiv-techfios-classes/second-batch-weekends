package extending.classes;

public class RoadCycles extends Bicycle {
	
	private int tyrewidth;
	
	
	public RoadCycles() {
		
		super();
	}
	
	public RoadCycles(int gears, String b, int twidth) {

		super(gears,b);
		
		this.tyrewidth = twidth;
	
	}
	
	public int getTyrewidth() {
		return tyrewidth;
	}

	public void setTyrewidth(int tyrewidth) {
		this.tyrewidth = tyrewidth;
	}
	
	

}
