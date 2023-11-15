import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um ano com 4 dígitos para verificar se é um ano bissexto ou não: ");
		int ano = entrada.nextInt();
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))
			System.out.print(ano + " é um ano bissexto.");
		else
			System.out.print(ano + " não é um ano bissexto.");
			
		entrada.close();
	}
}