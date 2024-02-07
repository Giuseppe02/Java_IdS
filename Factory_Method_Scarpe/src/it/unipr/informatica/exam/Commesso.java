package it.unipr.informatica.exam;

public class Commesso {
	public Scarpe getScarpe(String tipo) {
		Scarpe scarpe = null;
		if(tipo.equals("ginnastica"))
			scarpe = CommessoGinnastica.getScarpe();
		else if(tipo.equals("tennis"))
			scarpe = CommessoTennis.getScarpe();
		
		return scarpe;
	}
}//!commesso
