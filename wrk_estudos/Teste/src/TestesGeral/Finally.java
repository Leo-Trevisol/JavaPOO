package TestesGeral;

public class Finally {
	
	public static void main(String[] args) throws Exception {
		int var[] = new int[1];
		try {

			System.out.println(var[3]);
		} catch (Exception e) {
		} finally {
			System.out.println("Ola");
		}

		vetor();

	}
	
	public static int vetor() throws Exception {
		
		int var[] = new int[1];
		
		return var[3];
		
	}
}
