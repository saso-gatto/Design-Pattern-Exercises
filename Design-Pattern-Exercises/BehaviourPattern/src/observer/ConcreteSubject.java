package observer;

import java.util.ArrayList;

public class ConcreteSubject extends Subject {
	private ArrayList<Observer> ob;
	private String state;
	
	public ConcreteSubject() {
		ob=new ArrayList<Observer>();
	}
	
	public String getState() {
		return state;
	}
	
	public void setState (String s) {
		this.state=s;
		notifyTutti();
	}
	
	@Override
	public void attach(Observer o) {
		ob.add(o);
	}

	@Override
	public void notifyTutti() {
		for (int i =0;i<ob.size();i++)
			ob.get(i).update(state);
	}

}
