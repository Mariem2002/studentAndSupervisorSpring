package main;

public class Loup {
	
	private Orientation orientation;
	
	public Loup() {
		this.orientation = Orientation.Nord;
	}
	public Orientation getOrientation() {
		// TODO Auto-generated method stub
		return orientation;
	}
	public void tourner() {
		// TODO Auto-generated method stub
		switch (orientation) {
	    case Orientation.Nord:
	        orientation = Orientation.Est;
	        break;
	    case Orientation.Est:
	        orientation = Orientation.Sud;
	        break;
	    case Orientation.Sud:
	        orientation = Orientation.Ouest;
	        break;
	    case Orientation.Ouest:
	        orientation = Orientation.Nord;
	        break;
	    
	}
		
	}

}
