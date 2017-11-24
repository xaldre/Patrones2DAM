package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class SingletonPizzaVegetariana extends SingletonPizza {

	
	protected SingletonPizzaVegetariana(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una Cuatro Quesos!");
	}
}
