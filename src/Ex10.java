import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo número: ");
		int n2 = entrada.nextInt();
		System.out.print("Insira o terceiro número: ");
		int n3 = entrada.nextInt();
		
		System.out.print("\nMaior número: ");
		if(n1 >= n2 && n1 >= n3)
			System.out.println(n1);
		else if(n2 >= n1 && n2 >= n3)
			System.out.println(n2);
		else
			System.out.println(n3);
		
		System.out.print("Menor número: ");
		if(n1 <= n2 && n1 <= n3)
			System.out.print(n1);
		else if(n2 <= n1 && n2 <= n3)
			System.out.print(n2);
		else
			System.out.print(n3);
			
		entrada.close();
	}
}