package designPatterns.patterns.singleton.v2.basic;

public class SingletonPizza {

	private static SingletonPizza singleton;

	// Esta es una version muy basica del Singleton en la que usamos LazyLoading
	public static SingletonPizza instance() {
		if (singleton == null) {
			singleton = new SingletonPizza();
		}
		return singleton;
	}

	private SingletonPizza() {
	}

	public void getPizza() {
		System.out.println("Pizzero: Marchando pizza calentita");
	}
}
