package flyweight;

public class Client {
	public static void main(String[] args) {
		Albero albero = new Albero();
		albero.stampaAlbero();
		albero.addDecorazione("Palla");
		albero.addDecorazione("Stella");
		albero.stampaAlbero();
		albero.addDecorazione("Luci");
		albero.stampaAlbero();
	}
}
