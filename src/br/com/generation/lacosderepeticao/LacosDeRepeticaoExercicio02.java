package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio02 {

	
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
	public  static  void  main ( String [] args){
        Scanner  ent = new  Scanner ( System . in );
        int  num , Par = 0 , Impar = 0 ;

        for ( int  i = 1 ; i <= 10 ; i ++){
            System.out.println( "Digite o " + i + "� n�mero" );
            num = ent.nextInt ();

            if ( num % 2 == 0 ){
                Par++;
            } else {
            	Impar++;
            }
           

          System.out.println();
        }

        System.out.println( "Foram digitados " + Par + " n�meros pares \n" + "Foram digitados "+ Impar + " 1"
        	
        		+ " impares \n");
        
        
    }
        
}		