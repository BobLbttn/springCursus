package be.vdab;

import java.util.Arrays;

public class HelpDeskMedewerkers {

	private String[] namen;
	
	@Override 
	public String toString() {
		return Arrays.toString(namen);
	}

	public String[] getNamen() {
		return namen;
	}

	public void setNamen(String[] namen) {
		this.namen = namen;
	}


}
