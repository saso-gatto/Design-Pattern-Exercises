package visitor;

public class VisitorRettangolo implements Visitor {


	@Override
	public void visitorArea(Quadrilatero q) {
		float area=0;
		area=(q.getAltezza()*q.getBase());
		System.out.println("L'area del rettangolo è: "+area);
	}

	@Override
	public void visitorPerimetro(Quadrilatero q) {
		int perimetro=q.getAltezza()*2;
		perimetro+=q.getBase()*2;
		System.out.println("Il perimetro del rettangolo è: "+perimetro);
	}

}
