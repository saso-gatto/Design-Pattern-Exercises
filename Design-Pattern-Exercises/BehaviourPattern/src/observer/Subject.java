package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> ob = new ArrayList<Observer>();

	public abstract String getState();
	public abstract void setState(String s);
	public abstract void attach(Observer o);
	
	public abstract void notifyTutti();
}
