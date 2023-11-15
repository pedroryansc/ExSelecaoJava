import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira seu salário atual para calcular seu reajuste: ");
		float salAtual = entrada.nextFloat();
		
		System.out.print("\nSalário antes do reajuste: R$ " + salAtual + "\n"
						+ "Percentual de aumento aplicado: ");
		
		double aumento;
		if(salAtual <= 280) {
			aumento = salAtual * 0.20;
			System.out.println("20%");
		} else if(salAtual <= 700) {
			aumento = salAtual * 0.15;
			System.out.println("15%");
		} else if(salAtual <= 1500) {
			aumento = salAtual * 0.10;
			System.out.println("10%");
		} else {
			aumento = salAtual * 0.05;
			System.out.println("5%");
		}
		
		double salNovo = salAtual + aumento;
		
		System.out.print("Valor do aumento: R$ " + aumento + "\n"
						+ "Salário novo: R$ " + salNovo);
		
		entrada.close();
	}
}