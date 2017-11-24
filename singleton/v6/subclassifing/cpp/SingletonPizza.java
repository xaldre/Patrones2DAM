package v6.subclassifing.cpp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SingletonPizza {

	private static SingletonPizza singleton;
	
	public static SingletonPizza instance() {
		if (singleton == null) {
			String line = SingletonPizza.getSingletonConfigure();
			singleton = SingletonRegistry.instance().lookup(line);
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
		System.out.println("Pizza");
	}
}
