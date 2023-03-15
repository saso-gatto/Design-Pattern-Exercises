package adapter;

import java.awt.Shape;
import java.util.ArrayList;

public class GestisciFigure {
	private ArrayList <FiguraGeometrica> figure;
	
	public GestisciFigure() {
		figure = new ArrayList<FiguraGeometrica>();
	}
	
	void addFigura (FiguraGeometrica f) {
		figure.add(f);
	}
	
	void stampa () {
		System.out.println("Elenco di figure disponibili: ");
		for (int i = 0; i<figure.size();i++)
			figure.get(i).stampa();
	}

	
}
