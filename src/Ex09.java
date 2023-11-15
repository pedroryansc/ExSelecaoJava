import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira sua altura: ");
		float alt = entrada.nextFloat();
		System.out.print("Insira seu peso: ");
		float peso = entrada.nextFloat();
		
		char genero = 'a';
		while(genero != 'F' && genero != 'f' && genero != 'M' && genero != 'm') {
			System.out.print("Insira seu gênero (F - Feminino; M - Masculino): ");
			genero = entrada.next().charAt(0);
		}
		
		System.out.print("\nAltura: " + alt + " m \n"
						+ "Peso: " + peso + " kg \n"
						+ "Gênero: ");
		
		double pesoIdeal;
		if(genero == 'F' || genero == 'f') {
			pesoIdeal = (62.1 * alt) - 44.7;
			System.out.println("Feminino");
		} else {
			pesoIdeal = (72.7 * alt) - 58;
			System.out.println("Masculino");
		}
		
		System.out.println("Peso ideal: " + pesoIdeal + " kg \n");
		if(peso > pesoIdeal)
			System.out.print("Seu peso está acima do peso ideal.");
		else if(peso < pesoIdeal)
			System.out.print("Seu peso está abaixo do peso ideal.");
		else
			System.out.print("Seu peso está no peso ideal.");
		
		entrada.close();
	}
}