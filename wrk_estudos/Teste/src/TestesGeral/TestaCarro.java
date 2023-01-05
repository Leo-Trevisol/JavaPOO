
public class TestaCarro {
	
	static int x = 37;

	public static void main(String[] args) {
		
		Carro newCar;
		Motor motorzin = new Motor(120, "V8");
		
		Motor motorzao = motorzin;
		
		newCar = new Carro("Vermelho", "Fusqueta", 20, 120, motorzin);
		
		Carro newCar2 = newCar;
		
		newCar.setCor("Verde");
		
		/*
		 * CARRO1 E CARRO2 ESTAO DIVIDINDO O MESMO OBJETO
		 * O QUE MODIFICA EM UM, MODIFICA NO OUTRO
		 */

		System.out.println(newCar);
		System.out.println(newCar2);
		System.out.println(motorzin);
		System.out.println(x);

	}
}
