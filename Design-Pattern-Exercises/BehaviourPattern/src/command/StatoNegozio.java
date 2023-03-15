package command;

import java.util.HashMap;

public class StatoNegozio implements Ordine{
	private Negozio negozio;
	
	public StatoNegozio (Negozio n) {
		negozio = new Negozio();
		negozio.setProdotti(n.getProdotti());
	}
	
	
	@Override
	public void esegui() {
		negozio.stampaProdotti();
	}

}
