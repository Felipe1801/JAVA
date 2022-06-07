package br.com.generation.lacosdedecisao2;

import javax.swing.JOptionPane;

public class LacosDeDecisao2 { 


	public static void main(String[] args) {
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		

        int numeroUm, numeroDois, numeroTres;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número: "));
        numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro número: "));

        if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) 
        {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroTres + " " + numeroDois + " " + numeroUm);
        }
        else if (numeroUm > numeroDois && numeroUm > numeroTres && numeroTres > numeroDois) {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroDois + " " + numeroTres + " " + numeroUm);
        }
        else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroUm + " " + numeroTres + " " + numeroDois);
        }
        else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroUm > numeroTres) {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroTres + " " + numeroUm + " " + numeroDois);
        }
        else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroDois + " " + numeroUm + " " +  numeroTres);
        }
        else {
            JOptionPane.showMessageDialog(null, "A seguência é: " + numeroUm + " " + numeroDois + " " + numeroTres);
        }

    
	} 
	
}


	


