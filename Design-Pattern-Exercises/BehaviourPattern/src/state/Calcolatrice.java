package state;

public class Calcolatrice {
	   private State state;
	   private int numero1;
	   private int numero2;

	   public Calcolatrice(int num1, int num2){
	      state = null;
	      numero1=num1;
	      numero2=num2;
	   }
	   
	   public void setNumeri(int n1, int n2) {
		   this.numero1=n1;
		   this.numero2=n2;
	   }

	   public int getNum1() {
		   return numero1;
	   }
	   
	   public int getNum2() {
		   return numero2;
	   }
	   
	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}