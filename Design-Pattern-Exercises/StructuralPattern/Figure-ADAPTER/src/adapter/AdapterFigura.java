package adapter;

public class AdapterFigura implements FiguraGeometrica{
	private FigureCirconferenza figura;
	
	public AdapterFigura (FigureCirconferenza c) {
		this.figura=c;
	}
	
	@Override
	public double perimetro() {
		return figura.perimetro();
	}

	@Override
	public double area() {
		return figura.area();
	}

	@Override
	public void stampa() {
		System.out.println(figura.getClass().getName());
		
	}

}
