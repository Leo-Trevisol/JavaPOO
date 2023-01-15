package exceptions;

public class NovaException extends Exception{
	
	public NovaException(String message) {
		super(message);
	}
	
	public static void main(String[] args) throws NovaException {
		int conta = 1/0;
	}

}
