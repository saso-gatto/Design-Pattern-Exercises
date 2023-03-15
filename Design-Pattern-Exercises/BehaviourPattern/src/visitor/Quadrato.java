package visitor;

public class Quadrato implements Quadrilatero {
	private int lato;
	
	public Quadrato(int l) {
		this.lato=l;
	}

	@Override
	public int getAltezza() {
		return lato;
	}

	@Override
	public int getBase() {
		return lato;
	}

	public void acceptVisitor(Visitor v) {
		System.out.println("Calcolo area e perimetro del quadrato.");
		v.visitorArea(this);
		v.visitorPerimetro(this);
	}

}
