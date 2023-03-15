package iterator;

public class MaterieCorso implements Container {
	private String materie [];
	public MaterieCorso() {
		materie = new String [] {"Fondamenti","Programmazione ad Oggetti", "IGPE", "INGSW", "IA", "SOR"};
	}
	@Override
	public Iterator getIterator() {
		return new Iteratore();
	}
	
	private class Iteratore implements Iterator{
		private int index =0;
		
		@Override
		public boolean next() {
			if (index>=materie.length)
				return false;
			return true;
		}

		@Override
		public Object getNext() {
			return materie[index++];
		}
	}
}
