package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class SingletonPizzaPescado extends SingletonPizza {

	
	protected SingletonPizzaPescado(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una de Anchoas!");
	}
}
