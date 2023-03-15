package proxy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		LibrettoUni l1 = new ProxyLibretto("Salvatore-Gatto", "200856");
		l1.addMateriaSuperata("Linguaggi-25");
		l1.addMateriaSuperata("PO-25");
		l1.addMateriaSuperata("IGPE-25");
		System.out.println("Inserisci username e password per stampare i dati del libretto");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();
		String password = in.nextLine();
		l1.stampaDati(username,password);
	}
}
