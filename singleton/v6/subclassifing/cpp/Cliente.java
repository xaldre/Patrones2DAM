package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Un pizza calentita!!!");
		SingletonPizzaCarne.register();
		SingletonPizzaPescado.register();
		SingletonPizzaVegetariana.register();
		//...
		SingletonPizza.instance().getPizza();
		// ...
	}

	public static void main(String[] args) {
		new Cliente().pedirPizza();
	}

}
