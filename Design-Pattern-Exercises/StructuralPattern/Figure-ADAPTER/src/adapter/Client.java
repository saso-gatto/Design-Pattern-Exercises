package adapter;

public class Client {
	public static void main(String[] args) {
		GestisciFigure gf = new GestisciFigure();
		gf.addFigura(new Quadrato(5));
		gf.addFigura(new Rettangolo(2,5));
		gf.addFigura(new AdapterFigura(new Cerchio(4)));
		gf.stampa();
	}
}
