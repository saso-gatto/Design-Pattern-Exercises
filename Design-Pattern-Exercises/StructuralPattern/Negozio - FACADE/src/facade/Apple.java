package facade;

public class Apple implements Telefono {
	private String modello = "iPhone 12";
	private int prezzo=900;
	@Override
	public String getModello() {
		return this.modello;
	}
	@Override
	public int getPrezzo() {
		return this.prezzo;
	}
	
	
}
