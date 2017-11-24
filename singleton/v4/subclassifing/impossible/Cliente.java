package designPatterns.patterns.singleton.v4.subclassifing.impossible;

public class Cliente {

	private void pedirPizza() {
		System.out.println("Cliente: Niñooooo, una pizza aquí!");
		SingletonPizza.instance.getPizza();
	}
	
	public static void main(String[] args){
		new Cliente().pedirPizza();
	}

}
