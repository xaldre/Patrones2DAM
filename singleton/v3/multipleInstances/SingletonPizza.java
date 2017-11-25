package designPatterns.patterns.singleton.v3.subclassifing.multipleInstances;

import java.util.ArrayList;
import java.util.List;

public class SingletonPizza {

	private static List<SingletonPizza> singletonList = new ArrayList<SingletonPizza>();

	private static final String[] NAMES = {"carne", "pescado", "vegetariana"};
	
	private static final int MAX = NAMES.length;
	
	private static int turn = 0;

	public static SingletonPizza instance() {
		if (singletonList.size() < MAX) {
			singletonList.add(new SingletonPizza(NAMES[turn]));
		}
		int turn = SingletonPizza.turn;
		SingletonPizza.turn = (SingletonPizza.turn + 1)%MAX;
		return singletonList.get(turn);
	}

	private String name;
	
	private SingletonPizza(String name) {
		this.name = name;
	}

	public void getPizza() {
		System.out.println("Tenga su pizza de " + name);
	}
}
