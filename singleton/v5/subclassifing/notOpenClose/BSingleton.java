package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

public class BSingleton extends Singleton {

	
	protected BSingleton(){
		super();
	}
	
	public void m() {
		System.out.println("Ejecuci�n de m de BSingleton");
	}
}
