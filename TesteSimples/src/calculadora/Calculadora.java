package calculadora;

public class Calculadora {

	
	public static int somar(int a, int b){
		return (a + b);
	}

	public static String somar(String a, String b){
		return (a+b);
	}

	public static void main(String[] args) {
		System.out.println(somar(2,2));
	}
}
