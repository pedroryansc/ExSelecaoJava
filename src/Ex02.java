import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número para verificar se ele é positivo, negativo ou zero: ");
		int num = entrada.nextInt();
		if(num > 0)
			System.out.print("O número é positivo.");
		else if(num < 0)
			System.out.print("O número é negativo.");
		else
			System.out.print("O número é zero.");
		
		entrada.close();
	}
}