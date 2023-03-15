package strategy;

public class Client {
	public static void main(String[] args) {
		GestioneListe g = new GestioneListe();
		System.out.println("Pattern strategy.");
		int num1=10, num2=80;
		for (int i = 0; i<10; i++) {
			if (i%2==0)
				g.addElement(num1++);
			else
				g.addElement(num2++);
		}
		System.out.println("Array da ordinare:");
		g.stampa();
		g.sort();
	}
}
