package exercicios;

import java.util.Scanner;

public class exercicio8 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int custoFabrica, custoFinal;
		System.out.println("Informe o custo de fábrica do veículo:");
		custoFabrica = ler.nextInt();
		
		custoFinal = (int) (custoFabrica + (0.45 * custoFabrica));
		custoFinal = (int) (custoFinal + (0.28 * custoFinal));
		System.out.println("O custo do veículo para o cliente final é de: " + custoFinal);
	}

}
