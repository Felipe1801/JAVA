package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		int[] vetor = new int[10];
		int soma=0, maior=0, quantidade=0;
	    double media;
		Scanner entrada = new Scanner(System.in);
		//registra o valor do vetor
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			if(vetor[i] > maior) {
				maior = vetor[i];
				quantidade=0;
			}
			if(vetor[i] == maior) {
			quantidade++;
		}
		}
		//mostra o valor do vetor
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[1] + " | ");
		}
		media = soma / vetor.length;
		System.out.println("A media foi: " +media);
		System.out.println("A maior pontua��o foi: " +maior+ ", ele apareceu " + quantidade + "vezes.");
		
	}

	}

