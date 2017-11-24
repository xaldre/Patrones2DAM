package designPatterns.patterns.singleton.v7.subclassifing.java;

public class SingletonPizzaPescado extends SingletonPizza {

	
	protected SingletonPizzaPescado(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una de Anchoas!");
	}
}
