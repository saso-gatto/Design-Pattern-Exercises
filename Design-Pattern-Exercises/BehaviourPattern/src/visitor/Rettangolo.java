package visitor;

public class Rettangolo implements Quadrilatero {
	private int altezza;
	private int base;
	
	public Rettangolo(int h, int b) {
		this.altezza=h;
		this.base=b;
	}
	
	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int lato) {
		this.base = lato;
	}


	public void acceptVisitor(Visitor v) {
		System.out.println("Calcolo area e perimetro del rettangolo.");
		v.visitorArea(this);
		v.visitorPerimetro(this);
	}
}
