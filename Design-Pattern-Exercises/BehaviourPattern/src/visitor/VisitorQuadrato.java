package visitor;

public class VisitorQuadrato implements Visitor {

	@Override
	public void visitorArea(Quadrilatero q) {
		System.out.println("L'area del quadrato è: "+(q.getBase()*q.getBase()));
	}

	@Override
	public void visitorPerimetro(Quadrilatero q) {
		System.out.println("Il perimetro del quadrato è: "+(q.getBase()*4));

	}

}
