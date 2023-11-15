import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo número: ");
		int n2 = entrada.nextInt();
		
		if(n1 > n2)
			System.out.print("\nMaior número: " + n1);
		else if(n2 > n1)
			System.out.print("\nMaior número: " + n2);
		else
			System.out.print("\nOs dois números são iguais.");
		
		entrada.close();
	}
}