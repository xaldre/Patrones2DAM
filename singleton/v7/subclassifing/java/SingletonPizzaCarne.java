package designPatterns.patterns.singleton.v7.subclassifing.java;

public class SingletonPizzaCarne extends SingletonPizza {

	
	protected SingletonPizzaCarne(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una Barbacoa!");
	}
}
