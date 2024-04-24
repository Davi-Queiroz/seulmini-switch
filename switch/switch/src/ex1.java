import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite um letra");
		letra = in.next().toLowerCase();
		
		if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
	System.out.println("Vogal");		
		}
		else {
			System.out.println("Consoante");
		}
		
		in.close();
	}

}
