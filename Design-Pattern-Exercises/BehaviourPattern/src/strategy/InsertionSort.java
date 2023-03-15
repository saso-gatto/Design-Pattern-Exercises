package strategy;

import java.util.ArrayList;

public class InsertionSort implements GestioneSort	 {

	@Override
	public ArrayList<Integer> daOrdinare(ArrayList<Integer> l) {
		System.out.println("Sort con l'insertion");
		ArrayList <Integer> ordinato = new ArrayList<Integer>();
		ordinato=l;
		for (int i=1; i<ordinato.size(); i++) {
			int corrente = ordinato.get(i);
			int j =i-1;
			while (j>=0 && ordinato.get(j)>corrente) {
				ordinato.set(j+1,ordinato.get(j));
				j--;
			}
			ordinato.set(j+1,corrente);
		}
		return ordinato;
	}

}
