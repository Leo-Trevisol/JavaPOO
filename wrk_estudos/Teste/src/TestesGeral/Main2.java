
public class Main2 {

	public static void main(String[] args) {

		new Main2().inicializar();

	}

	public void inicializar() {

		Integer i = 0;
		System.out.println("1 - " + i);
		incrementar(i);
		System.out.println("2 - " + i);
	}

	public Integer incrementar(Integer i) {
		Integer in = new Integer(i.intValue() + 1);
		return in;
	}
}
