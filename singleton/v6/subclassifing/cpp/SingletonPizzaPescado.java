package designPatterns.patterns.singleton.v6.subclassifing.cpp;

public class SingletonPizzaPescado extends SingletonPizza {

	protected SingletonPizzaPescado() {
		super();
		SingletonRegistry.instance().register("SingletonPizzaPescado", this);
	}

	public void getPizza() {
		System.out.println("Pizzero: Marchando su pizza de pescado calentita!!!");
	}
	
	public static void register() {
		new SingletonPizzaPescado();
	}
}
