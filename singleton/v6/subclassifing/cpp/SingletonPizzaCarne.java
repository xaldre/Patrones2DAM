package v6.subclassifing.cpp;

public class SingletonPizzaCarne extends SingletonPizza {

	protected SingletonPizzaCarne() {
		super();
		SingletonRegistry.instance().register("Pizza de carne", this);
	}

	public void getPizza() {
		System.out.println("Tenga su pizza de carne");
	}
	
	public static void register() {
		new SingletonPizzaCarne();
	}
}
