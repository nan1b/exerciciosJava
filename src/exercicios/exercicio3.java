package exercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dHora, dSegundo, dMinuto, duracaoSegundos;
		System.out.println("Quantos segundos o evento durou?");
		dSegundo = ler.nextInt();
		
		dHora = dSegundo / 3600;
		dMinuto = dSegundo / 60;
		duracaoSegundos = (dSegundo%60);
		
		System.out.println("\nO evento durou " + dHora + " horas," + dMinuto + " minutos e "+ duracaoSegundos + " segundos");
	}

}
