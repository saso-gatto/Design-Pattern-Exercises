package composites;

public class Triangolo implements Figura { //Nodo foglia rappresentante un triangolo

	@Override
	public void stampa() {
		System.out.println("  .  ");
		System.out.println(" . . ");
		System.out.println(".....");
		System.out.println("Triangolo stampato!");
	}

}
