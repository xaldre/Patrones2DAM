package v6.subclassifing.cpp;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {

	private static SingletonRegistry singletonRegistry;

	public static SingletonRegistry instance() {
		if (singletonRegistry == null){
			singletonRegistry = new SingletonRegistry();
		}
		return singletonRegistry;
	}
	
	private SingletonRegistry () {
		
	}

	private Map<String, SingletonPizza> singletonMap = new HashMap<String, SingletonPizza>();

	protected void register(String name, SingletonPizza singleton) {
		singletonMap.put(name, singleton);
	}
	
	protected SingletonPizza lookup(String name) {
		return singletonMap.get(name);
	}

}
