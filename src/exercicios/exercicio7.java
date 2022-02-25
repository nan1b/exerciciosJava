package exercicios;

import java.util.Scanner;

public class exercicio7 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int numA, numB, numC, numD, numE, numF, numX, numY;
		System.out.println("Insira os valores inteiros e positivos para: A, B, C, D, E e F para descobrir os valores de X e Y:");
		numA = ler.nextInt();
		numB = ler.nextInt();
		numC = ler.nextInt();
		numD = ler.nextInt();
		numE = ler.nextInt();
		numF = ler.nextInt();
		
		numX = ((numC*numE)-(numB*numF)) / ((numA*numE)-(numB*numD));
		numY = ((numA*numF)-(numC*numD)) / ((numA*numE)-(numB*numD));
		
		System.out.println("O resultado de x é: " + numX + " e o resultado de y é: " + numY);
	}
}
