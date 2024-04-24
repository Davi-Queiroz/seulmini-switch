import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite um letra");
		letra = in.next().toLowerCase();
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Vogal");;
			break;
		default:
			System.out.println("Consoante");
		
		}
		in.close();
	}

}
