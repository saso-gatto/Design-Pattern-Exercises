package visitor;

public interface Quadrilatero {
	public int getAltezza();
	public int getBase();
	public void acceptVisitor(Visitor v);
}
