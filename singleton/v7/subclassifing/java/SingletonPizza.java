package designPatterns.patterns.singleton.v7.subclassifing.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SingletonPizza {

	private static SingletonPizza singleton;

	public static SingletonPizza instance() {
		if (singleton == null) {
			String line = SingletonPizza.getSingletonConfigure();
			try {
				singleton = (SingletonPizza) (Class
						.forName("designPatterns.patterns.singleton.v7.subclassifing.java." + line).newInstance());
			} catch (Exception e) {
				assert false;
			}
		}
		return singleton;
	}

	private static String getSingletonConfigure() {
		String line = "";
		try (BufferedReader in = new BufferedReader(new FileReader("singletonConfigure"))) {
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		}
		return line;
	}

	protected SingletonPizza() {

	}

	public void getPizza() {
		System.out.println("Pizzero: Marchando una base de pizza sin nada!");
	}
}
