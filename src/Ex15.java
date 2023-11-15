import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o preço de custo do produto: ");
		float preco = entrada.nextFloat();
		System.out.print("Insira o código de origem do produto: ");
		int origem = entrada.nextInt();
		
		System.out.print("\nPreço de custo: R$ " + preco + "\n"
						+ "Procedência: ");
		if(origem == 1)
			System.out.print("Sul");
		else if(origem == 2)
			System.out.print("Norte");
		else if(origem == 3)
			System.out.print("Leste");
		else if(origem == 4)
			System.out.print("Oeste");
		else if(origem == 5 || origem == 6)
			System.out.print("Nordeste");
		else if(origem == 7 || origem == 8)
			System.out.print("Centro-Oeste");
		else
			System.out.print("Importado");
		
		entrada.close();
	}
}