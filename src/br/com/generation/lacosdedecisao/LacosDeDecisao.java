package br.com.generation.lacosdedecisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class LacosDeDecisao {
	/*
	 * Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		int numero1, numero2, numero3, maior = 0;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		if(numero1 > maior) {
			maior = numero1;
		}
		if(numero2 > maior) {
		   maior = numero2;	
		}		   
		if(numero3 > maior) {
			maior = numero3;
		}	
		JOptionPane.showMessageDialog(null,  "O maior número digitado foi:" + maior);
		
	
		
	}
}