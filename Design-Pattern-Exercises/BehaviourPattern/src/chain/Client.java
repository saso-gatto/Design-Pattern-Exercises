package chain;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("Benvenuto nel centro assistenza.");
		System.out.println("Digitare 1 se hai un problema tecnico, 2 se hai un problema amministrativo.");
		int n = 0;
		Scanner in = new Scanner(System.in);
		do {
		n=in.nextInt();
		} while (n!=1 && n !=2);
		if (n==1) {
			System.out.println("Hai un dispositivo rotto, in assistenza o altro?");
			String problema;
			problema= in.next();
			OperatoreTecnico op = new OperatoreTecnico ();
			op.check(problema);
		}
		else {
			System.out.println("Hai un ordine smarrito, arrivato difettoso o altro?");
			String problema;
			problema= in.next();
			OperatoreAmministrativo op = new OperatoreAmministrativo ();
			op.check(problema);
		}
		
	}
}
