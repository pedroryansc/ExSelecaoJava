import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma letra para verificar se ela é uma vogal ou não: ");
		char letra = entrada.nextLine().charAt(0);
		if(letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || 
			letra == 'U' || letra == 'u')
			System.out.print(letra + " é uma vogal.");
		else
			System.out.print(letra + " é uma consoante.");
		
		entrada.close();
	}
}