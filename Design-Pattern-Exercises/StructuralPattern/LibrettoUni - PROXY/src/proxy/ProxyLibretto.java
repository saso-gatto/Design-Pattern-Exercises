package proxy;

public class ProxyLibretto implements LibrettoUni {

	private String nomeUtente;
	private String password;
	private LibrettoUtente libretto=null;
	
	public ProxyLibretto(String name, String p) {
		this.nomeUtente=name;
		this.password=p;
		this.libretto = new LibrettoUtente();
	}
	
	public boolean controllaDati(String n, String p) {
		if (this.nomeUtente.equals(n)==false || this.password.equals(p)==false)
			return false;
		return true;
	}
	
	@Override
	public void stampaDati(String nome, String p) {
		if (controllaDati(nome,p)) {
			System.out.println("Libretto di "+nomeUtente);
			libretto.stampaDati(nome, p);
		}
		else
			System.out.println("Login errato");
	}

	@Override
	public void addMateriaSuperata(String materia) {
		this.libretto.addMateriaSuperata(materia);
	}

}
