package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class SingletonPizzaCarne extends SingletonPizza {

	
	protected SingletonPizzaCarne(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una Barbacoa!");
	}
}
