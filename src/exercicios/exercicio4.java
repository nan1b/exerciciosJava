package exercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		double A, B, C, D, R, S = 0, numD;
		System.out.println("Digite 3 números inteiros e positivos: ");
		A = ler.nextDouble();
		B = ler.nextDouble();
		C = ler.nextDouble();
		
		R = Math.pow((A + B), 2);
		R = Math.pow((B + C), 2);
		numD = (R + S)/2;
				
		System.out.println("O resultado do cálculo é: " + numD);
	}
}
