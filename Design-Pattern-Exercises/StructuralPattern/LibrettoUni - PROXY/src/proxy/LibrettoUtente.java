package proxy;

import java.util.ArrayList;

public class LibrettoUtente implements LibrettoUni {
	private ArrayList <String> superate;
	
	public LibrettoUtente() {
		superate = new ArrayList<String>();
	}
	
	@Override
	public void stampaDati(String nomeUtente, String password) {
		System.out.println("----Materie superate----");
		for (int i = 0; i<superate.size(); i++)
			System.out.println(superate.get(i));
	}

	@Override
	public void addMateriaSuperata(String materia) {
		superate.add(materia);
	}

}
