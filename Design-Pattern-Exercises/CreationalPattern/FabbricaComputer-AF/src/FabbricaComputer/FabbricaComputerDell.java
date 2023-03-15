package FabbricaComputer;

public class FabbricaComputerDell extends FabbricaComputer {

	@Override
	public Laptop createLaptop() {
		Laptop t= new Laptop("Dell");
		return t;
	}

	@Override
	public Ultrabook createUltrabook() {
		Ultrabook u = new Ultrabook("Dell");
		return u;
	}

}
