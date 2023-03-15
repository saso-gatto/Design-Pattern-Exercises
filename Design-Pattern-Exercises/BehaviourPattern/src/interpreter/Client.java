package interpreter;

public class Client {
	public static void main(String[] args) {
		Contesto c = new Contesto();
		Espressione addizione = new Addizione();
		Espressione moltiplicazione = new Moltiplicazione();
		Espressione sottrazione = new Sottrazione();
		Espressione divisione = new Divisione();
		
		System.out.println("Benvenuto, questo programma ti permetterà di eseguire delle operazioni aritmetiche con gli ultimi due numeri che hai inserito!");
		Espressione n1 = new Numero (10);
		n1.interpreta(c);
		Espressione n2 = new Numero (17);
		n2.interpreta(c);
		System.out.println(addizione.interpreta(c));
		

	}
}
