package adapter;

public class Rettangolo implements FiguraGeometrica {
	public int base;
	public int altezza;
	
	public Rettangolo(int b, int h) {
		this.base=b;
		this.altezza=h;
	}
	
	
	@Override
	public double perimetro() {
		return 2*base+2*altezza;
	}

	@Override
	public double area() {
		return base*altezza;
	}


	@Override
	public void stampa() {
		System.out.println("Rettangolo");
	}

}
