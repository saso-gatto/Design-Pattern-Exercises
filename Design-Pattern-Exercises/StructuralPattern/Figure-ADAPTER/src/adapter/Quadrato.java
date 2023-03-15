package adapter;

public class Quadrato implements FiguraGeometrica{
	private int lato;
	
	public Quadrato(int l) {
		this.lato=l;
	}
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lato*4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lato*lato;
	}

	@Override
	public void stampa() {
		System.out.println("Quadrato");
	}

}
