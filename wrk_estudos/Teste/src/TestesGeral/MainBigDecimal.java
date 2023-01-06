package TestesGeral;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class MainBigDecimal {

	public static void main(String[] args) {

		/*
		 * Instanciando bigdecimals
		 */
		BigDecimal vlr1 = BigDecimal.ONE;
		BigDecimal vlr2 = new BigDecimal(1);
		BigDecimal vlr3 = new BigDecimal(10.50);
		BigDecimal vlr4 = new BigDecimal("15.30");
		BigDecimal vlr5 = new BigDecimal("20.30");

		System.out.println(vlr1);
		System.out.println(vlr2);
		System.out.println(vlr3);
		System.out.println(vlr4);
		System.out.println(vlr5);

		/*
		 * Convertendo bigdecimals
		 */
		{
			String vlr1String = vlr1.toString();
			Integer vlr3Integer = vlr3.intValue();
			Long vlr4Long = vlr4.longValue();

			System.out.println(vlr1String);
			System.out.println(vlr3Integer);
			System.out.println(vlr4Long);
		}

		/*
		 * Somando valores
		 */
		{
			BigDecimal soma = vlr1.add(vlr2);

			System.out.println("Soma 1: " + soma.toString());
			soma = soma.add(vlr3).add(vlr4).add(vlr5);

			System.out.println("Soma 2: " + soma.toString());
		}

		/*
		 * Outras opera��es
		 */
		{
			BigDecimal subtracao = vlr5.subtract(vlr4);
			System.out.println("Subtra��o: " + subtracao);
			
			BigDecimal divisao = vlr5.divide(vlr4, 2, RoundingMode.DOWN);
			System.out.println("Divis�o: " + divisao);
			
			BigDecimal multiplicacao = vlr5.multiply(vlr4);
			System.out.println("Multiplica��o: " + multiplicacao);
		}

		/**
		 * Classe utilit�ria do PDV: BigDecimalUtil
		 */
		{
//			BigDecimal novoValor = BigDecimalUtil.createBigDecimal("7.30");
//			BigDecimal novoValor2 = BigDecimalUtil.UM_CENTAVO;
//			
//			BigDecimal resultado = BigDecimalUtil.sum(novoValor, novoValor2);
//			
//			System.out.println("Resultado: " + resultado);
		}
	}

}
