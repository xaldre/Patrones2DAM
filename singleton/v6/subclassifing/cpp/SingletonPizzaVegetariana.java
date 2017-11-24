package v6.subclassifing.cpp;

public class SingletonPizzaVegetariana extends SingletonPizza {
	
	protected SingletonPizzaVegetariana() {
		super();
		SingletonRegistry.instance().register("Pizza vetetariana", this);
	}

	public void getPizza() {
		System.out.println("Pizza vegetariana.");
	}
	
	public static void register() {
		new SingletonPizzaVegetariana();
	}

}
