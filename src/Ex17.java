import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota do aluno: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a segunda nota do aluno: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		System.out.println("\n1ª nota: " + nota1 + "\n"
						+ "2ª nota: " + nota2 + "\n"
						+ "Média: " + media);
		
		char conceito;
		if(media >= 9)
			conceito = 'A';
		else if(media >= 7.5)
			conceito = 'B';
		else if(media >= 6)
			conceito = 'C';
		else if(media >= 4)
			conceito = 'D';
		else
			conceito = 'E';
		
		System.out.println("Conceito: " + conceito);
		
		if(conceito == 'A' || conceito == 'B' || conceito == 'C')
			System.out.print("\nAPROVADO");
		else
			System.out.print("\nREPROVADO");
		
		entrada.close();
	}
}