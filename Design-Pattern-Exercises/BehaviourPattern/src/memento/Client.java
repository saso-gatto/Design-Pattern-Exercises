package memento;

public class Client {
	public static void main(String[] args) {
		   
	      Originator originator = new Originator();
	      Caretaker caretaker = new Caretaker();
	      originator.setState("Stato 0, ore 11:50");
	      caretaker.add(originator.saveStateToMemento());
	      originator.setState("Stato 1, piove troppo, ore 11:51");
	      caretaker.add(originator.saveStateToMemento());
	      for (int i=0;i<2; i++)
	    	  System.out.println(caretaker.get(i).getState());
	   }
}
