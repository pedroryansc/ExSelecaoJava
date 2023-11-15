import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota do aluno: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a segunda nota do aluno: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		System.out.println("\nMédia: " + media);
		
		if(media < 3)
			System.out.print("Reprovado");
		else if(media < 7)
			System.out.print("Em Exame");
		else
			System.out.print("Aprovado");
		
		entrada.close();
	}
}