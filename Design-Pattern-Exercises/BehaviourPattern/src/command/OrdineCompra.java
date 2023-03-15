package command;

public class OrdineCompra implements Ordine{
	private Negozio n;
	private String prodotto;
	private Integer q;
	
	public OrdineCompra(Negozio negozio, String p, Integer num) {
		this.n=negozio;
		this.prodotto=p;
		this.q=num;
	}
	
	@Override
	public void esegui() {
		n.compra(prodotto,q);
	}

}
