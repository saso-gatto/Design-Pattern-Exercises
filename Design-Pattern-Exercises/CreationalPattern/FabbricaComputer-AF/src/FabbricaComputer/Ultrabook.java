package FabbricaComputer;

public class Ultrabook implements Computer {
	
	private String produttore;
	
	public Ultrabook (String p) {
		this.produttore=p;
	}
	
	@Override
	public void getType() {
		if (this.isTouch())
			System.out.println("Il computer in questione è un ultrabook, touch, "+produttore);
		else
			System.out.println("non sono touch e sono un ultrabook, prodotto da "+produttore);
	}

	@Override
	public boolean isTouch() {
		return true;
	}

	@Override
	public boolean lettoreDVD() {
		return false;
	}

}
