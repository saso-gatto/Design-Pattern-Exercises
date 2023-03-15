package adapter;

public class Cerchio implements FigureCirconferenza {
	private double raggio;
	
	public Cerchio (double r) {
		this.raggio=r;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (double) 2*pi*raggio;
	}

	@Override
	public double area() {
		return (double) pi*raggio*raggio;
	}

}
