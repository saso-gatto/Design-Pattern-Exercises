package composites;

public class Client {
	
	public static void main(String[] args) {
		DisegnaFigure df = new DisegnaFigure();
		Figura f1 = new Triangolo();
		Figura f2= new Rettangolo();
		df.add(f1);
		df.add(f2);
		df.stampa();
		
	}

}
