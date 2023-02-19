package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestesIterator {
	
	public static void main(String[] args) {
		
		ArrayList <String> carros = new ArrayList<String>();
		
		carros.add("Fusca");
		carros.add("Onix");
		carros.add("Meriva");
		carros.add("Sportage");
		carros.add("Palio");
		carros.add("Santana");
		
		System.out.println(carros );
		
		
		Iterator <String> it = carros.iterator();
		
		while(it.hasNext()) {
			
			String carro = it.next();
			
			if(carro == "Palio") {
				it.remove();
			}
			
		}
		
		System.out.println(carros);
		
		
	}

}
