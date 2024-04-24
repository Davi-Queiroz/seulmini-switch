import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, resu;

		System.out.println("digite um numero");
		num = in.nextInt();
		
		resu = num % 2;
		if(resu ==1) {
			System.out.println("Impar");
		}
		else {
			System.out.println("par");
		}
		
		switch(resu) {
		case 1:
			System.out.println("Impar");
			break;
		case 0:
			System.out.println("par");
			break;
	}
		
		System.out.println((resu == 0) ? "Par" : "Ímpar");

}}
