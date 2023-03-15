package strategy;

import java.util.ArrayList;

public class GestioneListe {
	private ArrayList<Integer> lista;
	private GestioneSort s;
	
	public GestioneListe() {
		lista = new ArrayList<Integer>();
	}
	
	public void addElement (int n) {
		lista.add(n);
	}
	
	public void stampa() {
		for (int i = 0; i<lista.size(); i++)
			System.out.println(lista.get(i));
	}
	
	
	public void sort() {
		if (lista.size()<10)
			s=new BubbleSort();
		else 
			s=new InsertionSort();
		lista=s.daOrdinare(lista);
		System.out.println("array ordinato: ");
		this.stampa();
	}
}
