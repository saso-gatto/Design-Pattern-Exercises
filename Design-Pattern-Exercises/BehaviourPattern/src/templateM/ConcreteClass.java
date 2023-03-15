package templateM;

public class ConcreteClass extends AbstractClass {

	@Override
	public boolean canAdd(int x, Soluzione s) {
		int rigaCorrente = s.getUltimaPos();
		int colonnaCorrente = x;
		for (int rigaPrec=0; rigaPrec<rigaCorrente; rigaPrec++){
			int colonnaPrec=s.getElement(rigaPrec); //in s.sol per ogni riga ho la colonna in cui ho posizionato la regina
			if (colonnaCorrente ==colonnaPrec || (rigaCorrente-rigaPrec)== (colonnaCorrente-colonnaPrec)) //sta nella diagonale
				return false;
		}
		return true;
	}

	@Override
	public void add(int x, Soluzione s) {
		s.addElement(x);		
	}


	@Override
	public void remove(Soluzione s) {
		s.remove();
	}

	

}
