package designPatterns.patterns.singleton.v7.subclassifing.java;

public class SingletonPizzaVegetariana extends SingletonPizza {

	
	protected SingletonPizzaVegetariana(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una Cuatro Quesos!");
	}
}
