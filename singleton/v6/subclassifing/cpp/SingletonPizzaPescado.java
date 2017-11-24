package v6.subclassifing.cpp;

public class SingletonPizzaPescado extends SingletonPizza {

	protected SingletonPizzaPescado() {
		super();
		SingletonRegistry.instance().register("Pizza de pescado", this);
	}

	public void getPizza() {
		System.out.println("Pizza de pescado.");
	}
	
	public static void register() {
		new SingletonPizzaPescado();
	}
}
