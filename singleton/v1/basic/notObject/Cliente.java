package designPatterns.patterns.singleton.v1.basic.notObject;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Eh tú, pizzero, dame una pizza!");
		SingletonPizza.getPizza();
	}

	public static void main(String[] args) {
		new Cliente().pedirPizza();
	}

}
