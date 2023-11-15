import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro. Caso seja um número par, este será transformado em "
						+ "ímpar e, caso seja um número ímpar, será transformado em par: ");
		int num = entrada.nextInt();
		if(num % 2 == 0)
			System.out.print(num + 1);
		else
			System.out.print(num - 1);
		
		entrada.close();
	}
}