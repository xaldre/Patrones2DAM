package designPatterns.patterns.singleton.v1.basic.notObject;

public class SingletonPizza {

	// Esta es una version incorrecta del Singleton dado que no se usan Objetos
	// Es la version de los "listos"
	public static void getPizza() {
		System.out.println("Pizzero: Ehhhhhhhhh..... sí!");
	}

	private SingletonPizza() {
	}
}
