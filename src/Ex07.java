import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo número: ");
		int n2 = entrada.nextInt();
		System.out.print("Insira o terceiro número: ");
		int n3 = entrada.nextInt();
		
		System.out.print("\nOrdem decrescente: ");
		if(n1 >= n2 && n1 >= n3) {
			System.out.print(n1 + ", ");
			if(n2 >= n3)
				System.out.print(n2 + " e " + n3);
			else
				System.out.print(n3 + " e " + n2);
		} else if(n2 >= n1 && n2 >= n3) {
			System.out.print(n2 + ", ");
			if(n1 >= n3)
				System.out.print(n1 + " e " + n3);
			else
				System.out.print(n3 + " e " + n1);
		} else {
			System.out.print(n3 + ", ");
			if(n1 >= n2)
				System.out.print(n1 + " e " + n2);
			else
				System.out.print(n2 + " e " + n1);
		}
		
		entrada.close();
	}
}