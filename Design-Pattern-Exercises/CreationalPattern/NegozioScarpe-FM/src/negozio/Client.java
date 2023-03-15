package negozio;

public class Client {
	
	public static void main(String[] args) {
		Commesso com = new Commesso();
		System.out.println("Quale scarpe vuoi acquistare?Tennis o ginnastica?");
		Scarpe g = com.getScarpe("ginnastica"); // Il client lavora solo con l'interfaccia del prodotto
		g.stampaProdotto();
	}
}
