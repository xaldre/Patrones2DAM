package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class SingletonPizzaCarne extends SingletonPizza {

	protected SingletonPizzaCarne() {
		super();
		SingletonRegistry.instance().register("SingletonPizzaCarne", this);
	}

	public void getPizza() {
		System.out.println("Pizzero: Marchando su pizza de carne calentita!!!");
	}
	
	public static void register() {
		new SingletonPizzaCarne();
	}
}
