package animal;

import animais.Arara;
import animais.Canguru;
import animais.GoldFish;
import animais.Tartaruga;
import animaisGenericos.Animal;
import animaisGenericos.AveGeneric;
import animaisGenericos.MamiferoGeneric;

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
