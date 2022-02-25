package exercicios;

import java.util.Scanner;

public class exercicio5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, mediaP;
		System.out.println("Insira as três notas do aluno: ");
		nota1 = ler.nextDouble();
		nota2 = ler.nextDouble();
		nota3 = ler.nextDouble();
		
		mediaP = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		System.out.println("A média do aluno é: " + mediaP);
	}
}
