import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a letra correspondente ao turno em que você estuda (M - Matutino, "
						+ "V - Vespertino, N - Noturno): ");
		char turno = entrada.next().charAt(0);
		if(turno == 'M' || turno == 'm')
			System.out.print("Bom dia!");
		else if(turno == 'V' || turno == 'v')
			System.out.print("Boa tarde!");
		else if(turno == 'N' || turno == 'n')
			System.out.print("Boa noite!");
		else
			System.out.print("Letra inválida.");
		
		entrada.close();
	}
}