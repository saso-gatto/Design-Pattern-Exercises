package facade;

public class Negozio {
	private Telefono pixel;
	private Telefono galaxy;
	private Telefono iphone;
	
	public Negozio() {
		pixel = new Google();
		galaxy = new Samsung();
		iphone = new Apple();
	}
	
	public Telefono getTelefono(String azienda) {
		if (azienda.equals("Samsung"))
			return galaxy;
		else if (azienda.equals("Apple"))
			return iphone;
		else if (azienda.equals("Google"))
			return pixel;
		else {
			System.out.println("Telefono non disponibile");
			return null;
		}
	}

}
