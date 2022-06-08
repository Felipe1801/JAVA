package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio02 {

	
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
	public  static  void  main ( String [] args){
        Scanner  ent = new  Scanner ( System . in );
        int  num , Par = 0 , Impar = 0 ;

        for ( int  i = 1 ; i <= 10 ; i ++){
            System.out.println( "Digite o " + i + "º número" );
            num = ent.nextInt ();

            if ( num % 2 == 0 ){
                Par++;
            } else {
            	Impar++;
            }
           

          System.out.println();
        }

        System.out.println( "Foram digitados " + Par + " números pares \n" + "Foram digitados "+ Impar + " 1"
        	
        		+ " impares \n");
        
        
    }
        
}		