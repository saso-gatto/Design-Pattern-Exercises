package flyweight;

public class TipoDecorazione extends Decorazione {
	private String tipo;
	
	public TipoDecorazione(String tipo) {
		this.tipo=tipo;
		if (tipo.equals("Palla"))
			this.setColore("Rossa");
		else if (tipo.equals("Stella"))
			this.setColore("Gialla");
		else if (tipo.equals("Luci"))
			this.setColore("Vari");
		}
	
	@Override
	public void stampa() {
		System.out.println(tipo+", colore: "+this.getColore());
	}

}
