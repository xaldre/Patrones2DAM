package v3.multipleInstances;

public class Cliente {

	private void pedirPizza() {
		//...
		for(int i=0; i<10; i++){
			SingletonPizza.instance().getPizza();
		}
		//...
	}
	
	public static void main(String[] args){
		new Cliente().pedirPizza();
	}

}
