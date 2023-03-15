package state;

public class Somma implements State{

	   public void doAction(Calcolatrice context) {
	      context.setState(this);	
	      System.out.println("Somma di "+context.getNum1()+"+"+context.getNum2()+"="+(context.getNum1()+context.getNum2()));
	   }

	   public String toString(){
	      return "Stato di somma";
	   }


}
