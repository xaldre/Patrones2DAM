package designPatterns.patterns.singleton.v4.subclassifing.impossible;

public class SingletonPizza {
	
	public static SingletonPizza instance = new SingletonPizza();
	
	public void getPizza() {
		System.out.println("Pizzero: ¡Marchando!");
	}
}
