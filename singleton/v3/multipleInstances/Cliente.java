package designPatterns.patterns.singleton.v3.subclassifing.multipleInstances;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Quisiera una pizza, por favor.");
		SingletonPizza.instance().getPizza();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Cliente().pedirPizza();
		}
	}

}
