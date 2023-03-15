package visitor;

public class Client {
	public static void main(String[] args) {
		Quadrilatero q = new Rettangolo (10,5);
		q.acceptVisitor(new VisitorRettangolo());
		q = new Quadrato (8);
		q.acceptVisitor(new VisitorQuadrato());
	}
}
