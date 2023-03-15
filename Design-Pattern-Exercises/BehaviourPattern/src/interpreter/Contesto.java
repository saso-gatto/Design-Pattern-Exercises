package interpreter;

import java.util.Stack;

public class Contesto {
	private Stack <Integer> pila;
	
	public Contesto() {
		pila= new Stack<Integer>();
	}
	
	public void addElement(int n) {
		this.pila.add(n);
	}
	
	public int getElement() {
		try {
			return pila.pop();
		} catch (Exception e) {
			System.out.println("sono finiti gli elementi che hai a disposizione!");
		}
		return 0;
	}
}
