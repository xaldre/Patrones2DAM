package designPatterns.patterns.singleton.v4.subclassifing.impossible;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Ni�ooooo, una pizza aqu�!");
		SingletonPizza.instance.getPizza();
	}
	
	public static void main(String[] args){
		new Cliente().pedirPizza();
	}

}
