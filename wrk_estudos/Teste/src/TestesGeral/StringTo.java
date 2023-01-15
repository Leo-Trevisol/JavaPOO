package TestesGeral;

public class StringTo {

	
	public static void main(String[] args) {
		
		String teste = "123456789";
		int i = Integer.parseInt(teste);
		System.out.println(i + 20000);
		
		System.out.println(teste.substring(0));
		System.out.println(teste.length());
		System.out.println(teste.charAt(5));
		System.out.println(teste.indexOf("5"));
		System.out.println(teste.lastIndexOf("5"));
		System.out.println(teste.isEmpty());
		System.out.println(teste.replace("5", "0"));
		System.out.println(teste.replaceAll("123", "leozin"));
		
		System.out.println("-------------------------------");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Leo");
		sb.append("zin");
		sb.append(10);
		sb.append(false);
		sb.append(sb);
		
		System.out.println(sb);
		
	}

}
