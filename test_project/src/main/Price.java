package main;

public class Price {

	private static final float TVA = 19;

	public float getTTC(float pHT) {
		// TODO Auto-generated method stub
		return pHT + pHT * TVA / 100 ;
	}

}
