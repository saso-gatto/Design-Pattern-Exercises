package templateM;

import java.util.ArrayList;

public class Soluzione {
	private int n=5;
	private int ultimaPosValida;
	private int nqueen;
	
	private ArrayList <Integer> sol;
	
	public Soluzione(int n) {
		this.ultimaPosValida=0;
		this.nqueen=n;
		sol = new ArrayList<Integer>();
	}
	
	public void stampaSol() {
		System.out.println("Stampa soluzione");
		for (int i = 0; i<sol.size(); i++)
			System.out.println(sol.get(i));
	}
	
	public void addElement (int n) {
		try {
	    if (this.ultimaPosValida>=sol.size())
	    	sol.add(n);
	    else
	    	sol.set(this.ultimaPosValida++,n);
		} catch (Exception e) {
		   System.out.println("ultimaPosValida è: "+this.ultimaPosValida);
		}
	}
	
	public void remove() {
		this.ultimaPosValida--;
	}
	
	public int getElement(int n) {
		return this.sol.get(n);
	}
	
	public boolean isComplete() {
		return this.ultimaPosValida==this.nqueen;
	}
	
	public int getUltimaPos () {
		return this.ultimaPosValida;
	}
	
	public int getSize() {
		return sol.size();
	}
}
