package command;

import java.util.HashMap;

public class Negozio {
	private String negozio;
	private HashMap<String,Integer> prodotto;
	
	public Negozio() {
		this.negozio="Negozio 1";
		this.prodotto=new HashMap<String, Integer>();
	}
	
	public void stampaProdotti() {
		for (String key: prodotto.keySet()) {
			Integer value = prodotto.get(key);
			System.out.println("Prodotto "+key+", quantità: "+value);
		}
	}
	
	public void compra(String k,Integer q) {
		if (!prodotto.containsKey(k))
			prodotto.put(k,0);
		prodotto.put(k,prodotto.get(k)+q);
	}
	
	public void setProdotti(HashMap<String,Integer> p) {
		this.prodotto=p;
	}
	
	public HashMap<String, Integer> getProdotti() {
		return prodotto;
	}
	

	
}
