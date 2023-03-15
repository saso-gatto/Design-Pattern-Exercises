package FabbricaComputer;

public class Laptop implements Computer {
	
	private String produttore;
	
	public Laptop(String p) {
		this.produttore=p;
	}
	
	
	@Override
	public void getType() {
		if (this.isTouch())
			System.out.println("Il computer è un laptop, touch prodotto da "+produttore);
		else
			System.out.println("Il computer è un laptop non touch prodotto da "+ produttore);
		
	}


	@Override
	public boolean isTouch() {
		return false;
		
	}


	@Override
	public boolean lettoreDVD() {
		return true;
	}


}
