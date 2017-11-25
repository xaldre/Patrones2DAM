package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class SingletonPizzaVegetariana extends SingletonPizza {
	
	protected SingletonPizzaVegetariana() {
		super();
		SingletonRegistry.instance().register("SingletonPizzaVegetariana", this);
	}

	public void getPizza() {
		System.out.println("Pizzero: Marchando su pizza vegetariana calentita!!!");
	}
	
	public static void register() {
		new SingletonPizzaVegetariana();
	}

}
