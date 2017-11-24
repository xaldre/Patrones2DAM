package designPatterns.patterns.singleton.v1.basic.notObject;

public class SingletonPizza {

	public static void getPizza() {
		System.out.println("Pizzero: Marchando pizza calentita");
	}

	private SingletonPizza() {
	}
}
