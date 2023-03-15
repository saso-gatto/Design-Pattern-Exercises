package flyweight;

public abstract class Decorazione {
	protected String colore;
	public String getColore() {return this.colore;}
	public void setColore (String c) {this.colore=c;}
	public abstract void stampa();
	
}
