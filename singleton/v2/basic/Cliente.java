package designPatterns.patterns.singleton.v2.basic;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Eh tú, pizzero, dame una pizza!");
		SingletonPizza.instance().getPizza();
	}
	
	public static void main(String[] args){
		new Cliente().pedirPizza();
	}

}
