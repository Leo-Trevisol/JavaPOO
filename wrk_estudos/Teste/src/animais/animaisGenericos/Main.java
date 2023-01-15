package animais.animaisGenericos;

import animais.animaisSubclasse.Arara;
import animais.animaisSubclasse.Canguru;
import animais.animaisSubclasse.GoldFish;
import animais.animaisSubclasse.Tartaruga;

public class Main {

	public static void main(String[] args) {

		Arara v = new Arara();

		v.emitirSom();
		v.alimentar();
		v.locomover();

		System.out.println("----------------------");

		Canguru c = new Canguru();

		c.emitirSom();
		c.alimentar();
		c.locomover();

		System.out.println("----------------------");

		GoldFish g = new GoldFish();

		g.emitirSom();
		g.alimentar();
		g.locomover();

		System.out.println("----------------------");

		Tartaruga t = new Tartaruga();

		t.emitirSom();
		t.alimentar();
		t.locomover();

		System.out.println("----------------------");
		
		AveGeneric av = new AveGeneric();
		av.emitirSom();

	}

}
