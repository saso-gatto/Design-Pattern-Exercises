package interpreter;

public class Numero implements Espressione {

	private int num;
	
	public Numero(int n) {
		this.num=n;
	}
	
	@Override
	public int interpreta(Contesto c) {
		c.addElement(this.num);
		return this.num;
	}

}
