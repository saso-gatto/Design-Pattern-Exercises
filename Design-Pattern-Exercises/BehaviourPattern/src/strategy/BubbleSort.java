package strategy;

import java.util.ArrayList;

public class BubbleSort implements GestioneSort {

	@Override
	public ArrayList<Integer> daOrdinare(ArrayList<Integer> l) {
		System.out.println("Sort col bubble");
		ArrayList<Integer> ordinato = new ArrayList<Integer>();
		ordinato = l;
		int n= ordinato.size();  
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j <(n-i); j++){  
        		if(ordinato.get(j-1)>ordinato.get(j)){  
                   //scambia elementi
        			temp = ordinato.get(j-1);  
        			ordinato.set(j-1,ordinato.get(j));
                    ordinato.set(j,temp);  
        		}  
        	}  
        }
        return ordinato;
	}

}
