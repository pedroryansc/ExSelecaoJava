import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char letra = 'a';
		while(letra != 'F' && letra != 'M') {
			System.out.print("Insira a letra 'F' ou 'M': ");
			letra = entrada.nextLine().charAt(0);
		}
		
		if(letra == 'F')
			System.out.print("Feminino");
		else
			System.out.print("Masculino");
		
		entrada.close();
	}
}