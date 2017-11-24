package designPatterns.patterns.singleton.v5.subclassifing.notOpenClose;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class SingletonPizza {

	private static SingletonPizza singleton;

	public static SingletonPizza instance() {
		if (singleton == null) {
			String line = SingletonPizza.getSingletonConfigure();
			if (line.equals("SingletonPizzaCarne")) {
				singleton = new SingletonPizzaCarne();
			} else if (line.equals("SingletonPizzaPescado")) {
				singleton = new SingletonPizzaPescado();
			} else if (line.equals("SingletonPizzaVegetariana")) {
				singleton = new SingletonPizzaVegetariana();
			} else {
				assert false;
			}
		}
		return singleton;
	}

	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("singletonConfigure"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: " + ex.getMessage());
				}
			}
		}
		return line;
	}

	protected SingletonPizza() {

	}

	public void getPizza() {
		System.out.println("Pizzero: Toma la pizza de la casa!");
	}
}
