package negozio;

public class CommessoGinnastica extends Commesso {	//concrete creator
	
	public static ScarpaGinnastica getScarpa() {
		ScarpaGinnastica g = new ScarpaGinnastica();
		return g;
	}
	

}
