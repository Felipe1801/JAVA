package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		 */
		
		double [] vetor = new double[5];
		double maior = 0;
		
		for(int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor: ");   		
            vetor[i] = new Scanner(System.in).nextDouble();
            
             if(vetor[i] > maior) {
            	 maior = vetor[1];
             }
		}
	    System.out.println("A maior pontua��o foi: " + maior);
		
		
}

}
	
