import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade que você ganha por hora: ");
		float valor = entrada.nextFloat();
		System.out.print("Insira a quantidade de horas que você trabalhou neste mês: ");
		float horas = entrada.nextFloat();
		
		float salBruto = valor * horas;
		System.out.print("\nSalário bruto: R$ " + salBruto + "\n"
						+ "(-) IR (");
		
		double impRenda = 0;
		if(salBruto <= 900)
			System.out.println("Isento)");
		else {
			if(salBruto <= 1500) {
				impRenda = salBruto * 0.05;
				System.out.print("5%");
			} else if(salBruto <= 2500) {
				impRenda = salBruto * 0.10;
				System.out.print("10%");
			} else {
				impRenda = salBruto * 0.20;
				System.out.print("20%");
			}
			System.out.println("): R$ " + impRenda);
		}
		
		double inss = salBruto * 0.10;
		double fgts = salBruto * 0.11;
		double descontos = impRenda + inss;
		double salLiq = salBruto - descontos;
		
		System.out.print("(-) INSS (10%): R$ " + inss + "\n"
						+ "FGTS (11%): R$ " + fgts + "\n"
						+ "Total de descontos: R$ " + descontos + "\n"
						+ "Salário líquido: R$ " + salLiq);
		
		entrada.close();
	}
}