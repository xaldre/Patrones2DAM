package designPatterns.patterns.singleton.v7.subclassifing.java;

public class SingletonPizzaHawaiana extends SingletonPizza {

	
	protected SingletonPizzaHawaiana(){
		super();
	}
	
	public void getPizza() {
		System.out.println("Pizzero: Marchando una pizza HAWAIANA! \n ¡¡¡Ahora no os podeis echar atrás!!! MUAHAHAH");
	}
}
