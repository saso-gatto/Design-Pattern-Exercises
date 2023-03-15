package state;

public class Client {
	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice(5,5);
		State operazione = new Somma();
		c.setState(operazione);
	    operazione.doAction(c);
	    operazione = new Sottrazione();
	    c.setNumeri(20,8);
	    operazione.doAction(c);
	}
}
