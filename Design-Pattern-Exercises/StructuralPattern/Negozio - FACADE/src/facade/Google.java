package facade;

public class Google implements Telefono {
	private String modello = "Pixel 4";
	private int prezzo = 800;
	
	
	@Override
	public String getModello() {
		return this.modello;
	}

	@Override
	public int getPrezzo() {
		return this.prezzo;
	}

}
