package FabbricaComputer;

public class Client {

	public static void main(String[] args) {
		System.out.println("ciao, benvenuto in questo esempio");
		FabbricaComputer fab1=new FabbricaComputerHP();
		FabbricaComputer fab2=new FabbricaComputerDell();
		
		Computer l1 = fab1.createLaptop();
		l1.getType();
		
		Computer l2=fab2.createUltrabook();
		l2.getType();
		
	}
}
