package iterator;

public class Client {
	public static void main(String[] args) {
		Container c = new MaterieCorso();
		Iterator it = c.getIterator();
		while (it.next()) {
			System.out.println(it.getNext());
		}
	}
}
