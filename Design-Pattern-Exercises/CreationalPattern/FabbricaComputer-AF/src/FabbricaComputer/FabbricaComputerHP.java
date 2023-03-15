package FabbricaComputer;

public class FabbricaComputerHP  extends FabbricaComputer {

	@Override
	public Laptop createLaptop() {
		Laptop t= new Laptop("HP");
		return t;
	}

	@Override
	public Ultrabook createUltrabook() {
		Ultrabook u = new Ultrabook("HP");
		return u;
	}

}
