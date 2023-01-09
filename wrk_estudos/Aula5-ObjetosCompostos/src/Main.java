

public class Main {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Leozin", "Brazil", 17, 1.70, 71.0, 10, 5, 1);
		l1.apresentar();

			   int min = 0; // Minimum value of range
		      int max = 2; // Maximum value of range
		      // Print the min and max  
		      System.out.println("Random value in int from "+ min + " to " + max + ":");
		      // Generate random int value from min to max
		      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		      // Printing the generated random numbers
		      System.out.println(random_int);	

	}

}
