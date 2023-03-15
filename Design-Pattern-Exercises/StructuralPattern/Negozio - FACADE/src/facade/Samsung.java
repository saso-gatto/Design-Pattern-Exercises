package facade;

public class Samsung implements Telefono {
	private String modello = "Galaxy S20";
	private int prezzo = 500;
	
	@Override
	public String getModello() {
		return this.modello;
	}

	@Override
	public int getPrezzo() {
		return this.prezzo;
	}
	
}
