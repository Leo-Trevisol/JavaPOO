package TestesGeral;
public class Main {

	public static void main(String[] args) {

		new Main().inicializar();

	}

	public void inicializar() {

		Carro carroVW = new Carro("VW");
		Carro carroVW2 = carroVW;
		
		System.out.println("1.1 - " + carroVW);
		System.out.println("1.2 - " + carroVW2);
		
		informarModelo(carroVW, "Fusca");
		
		System.out.println("2.1 - " + carroVW);
		System.out.println("2.2 - " + carroVW2);
	}

	public void informarModelo(Carro carro, String modelo) {
		carro.setModeloCarro(modelo);
		// return carro;
	}
	
	public class Carro {

		private String	marcaCarro;
		private String	modeloCarro;

		public Carro() {
			super();
		}

		public Carro(String marcaCarro) {
			super();
			this.marcaCarro = marcaCarro;
		}

		public Carro(String marcaCarro, String modeloCarro) {
			super();
			this.marcaCarro = marcaCarro;
			this.modeloCarro = modeloCarro;
		}

		/**
		 * @return the marcaCarro
		 */
		public String getMarcaCarro() {
			return marcaCarro;
		}

		/**
		 * @param marcaCarro
		 *            the marcaCarro to set
		 */
		public void setMarcaCarro(String marcaCarro) {
			this.marcaCarro = marcaCarro;
		}

		/**
		 * @return the modeloCarro
		 */
		public String getModeloCarro() {
			return modeloCarro;
		}

		/**
		 * @param modeloCarro
		 *            the modeloCarro to set
		 */
		public void setModeloCarro(String modeloCarro) {
			this.modeloCarro = modeloCarro;
		}
		
		@Override
		public String toString() {
			return "Carro [marcaCarro=" + marcaCarro + ", modeloCarro=" + modeloCarro + "]";
		}

	}
}
