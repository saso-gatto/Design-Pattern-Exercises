package templateM;

public class Client {
	public static void main(String[] args) {
		int n=4;
		Soluzione s = new Soluzione(n);
		AbstractClass problema = new ConcreteClass();
		if (problema.solve(s)) {
			System.out.println("Soluzione trovata");
			s.stampaSol();
		}
		else
			System.out.println("soluzione non trovata");
	}
}
