package designPatterns.patterns.singleton.v2.basic;

public class SingletonPizza {

	private static SingletonPizza singleton;

	public static SingletonPizza instance() {
		if (singleton == null) {
			singleton = new SingletonPizza();
		}
		return singleton;
	}

	private SingletonPizza() {
	}

	public void getPizza() {
		System.out.println("Pizzero: Ehhhhhhhhh..... sí!");
	}
}
