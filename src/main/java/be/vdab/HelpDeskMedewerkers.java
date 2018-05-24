package be.vdab;

import java.util.Map;

public class HelpDeskMedewerkers {

	private Map<String, Integer> medewerkers;
	
	HelpDeskMedewerkers(Map<String, Integer> medewerkers) {
		this.medewerkers = medewerkers;
	}

	@Override 
	public String toString() {
		return medewerkers.toString();
	}


}
