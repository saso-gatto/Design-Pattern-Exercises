package observer;

public class Client {
	public static void main(String[] args) {
		Subject studente = new ConcreteSubject();
	
		Observer genitore1 = new Genitore(studente);
		Observer genitore2 = new Genitore(studente);
		studente.attach(genitore1);
		studente.attach(genitore2);
		
		studente.setState("Sono a casa");
		studente.setState("sono uscito ancora");
	}
}
