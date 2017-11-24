package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Una pizza para llevar, por favor.");
		SingletonPizza.instance().getPizza();
	}

	public static void main(String[] args) {
		new Cliente().pedirPizza();
	}

}
