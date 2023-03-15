package negozio;

public class Commesso { //Creator

	public Scarpe getScarpe (String tipoScarpe) {
		Scarpe scarpe = null;
		if (tipoScarpe.equals("ginnastica"))
			scarpe = CommessoGinnastica.getScarpa();
		else if (tipoScarpe.equals("tennis"))
			scarpe=CommessoTennis.getScarpe();
		return scarpe;
	}
	
}
