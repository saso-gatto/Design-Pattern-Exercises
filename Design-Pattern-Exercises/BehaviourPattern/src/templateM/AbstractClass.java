package templateM;


public abstract class AbstractClass {
	private Soluzione sol;
	private int nqueens=0;
	
	public AbstractClass() {
		sol = new Soluzione (this.nqueens);
	}
	
	public abstract boolean canAdd(int x, Soluzione s);
	public abstract void add (int x, Soluzione s);
	public abstract void remove (Soluzione s);
	//public abstract int next (int x);
	
	public boolean solve (Soluzione sol) {
		int x = 0;
		while (x<=this.nqueens) { //sol.size()=MAX VALUE
			if (canAdd(x,sol)) {
				add(x,sol);
				if(sol.isComplete())
					return true;
				else if (solve(sol))
					return true;
				remove(sol);
				x++;
			}
			else
				x++;
		}
		return false;
	}

}
