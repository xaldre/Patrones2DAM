package v6.subclassifing.cpp;

public class Cliente {

	private void pedirPizza() {
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
