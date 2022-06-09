package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
		 */

		int [][] M = new int [3][3]; 
		int somaM = 0, somaDiagonal = 0;
		
		Scanner entrada = new Scanner(System.in);
	
	
		for(int l=0; l < 3; l++) {
	    for(int c=0; c < 3; c++) {
	    	System.out.println("Digite um numero: ");
			 M[l][c] = entrada.nextInt();
			 
			 somaM += M[l][c];
	    }
		}
		for(int l=0; l < 3; l++) {
		    for(int c=0; c < 3; c++) {
		    	if(l==c) {
		    	
						somaDiagonal += M[l][c];
		}
				
		}
		}
		System.out.println("\nSoma dos valores da Matriz é: " + somaM);
		System.out.println("\nSoma da Diagonal Principal é: " + somaDiagonal);
	}


}
