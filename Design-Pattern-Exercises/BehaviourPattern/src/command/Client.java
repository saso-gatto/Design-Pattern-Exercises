package command;

public class Client {
	public static void main(String[] args) {
		Negozio n =new Negozio();
		Fornitore f = new Fornitore();
		f.prendiOrdine(new OrdineCompra(n,"camicie",10));
		f.piazzaOrdine();
		f.prendiStoricoNegozio(new StatoNegozio(n));
		System.out.println("Prima stampa");
		n.stampaProdotti();
		f.prendiOrdine(new OrdineCompra(n,"Jeans",15));
		f.piazzaOrdine();
		System.out.println("seconda stampa");
		n.stampaProdotti();
		f.stampaStorico();
	}
}
