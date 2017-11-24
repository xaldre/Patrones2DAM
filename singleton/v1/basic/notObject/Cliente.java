package designPatterns.patterns.singleton.v1.basic.notObject;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: ¡Pizza! ¿Tienes pizza?");
		SingletonPizza.getPizza();
	}

	public static void main(String[] args) {
		new Cliente().pedirPizza();
	}

}
