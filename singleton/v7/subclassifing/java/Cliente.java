package designPatterns.patterns.singleton.v7.subclassifing.java;

public class Cliente {

	private void pedirPizza() {
		System.out.println("- Pongame la mejor pizza de la casa - dijo el cliente");
		SingletonPizza.instance().getPizza();
	}

	public static void main(String[] args) {
		new Cliente().pedirPizza();
	}

}
