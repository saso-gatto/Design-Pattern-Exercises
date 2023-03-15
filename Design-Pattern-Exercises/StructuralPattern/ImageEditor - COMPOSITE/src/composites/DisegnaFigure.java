package composites;

import java.util.ArrayList;

public class DisegnaFigure implements Figura {
	private ArrayList <Figura> figure;

	DisegnaFigure() {
		figure = new ArrayList<Figura>();
	}
	
	public void add(Figura a) {
		figure.add(a);
	}
	
	@Override
	public void stampa() {
		for (int i = 0; i<figure.size(); i++)
			figure.get(i).stampa();
	}
	
}
