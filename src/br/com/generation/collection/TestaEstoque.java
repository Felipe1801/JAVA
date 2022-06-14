package br.com.generation.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		ArrayList<Estoque> estoqueProdutos = new ArrayList<>();
	                
                    
		            estoqueProdutos.add(new Estoque("Celular Samsung",15000.00, 2, 360.0));
		            System.out.println(estoqueProdutos.get(0));
		            		            
		            estoqueProdutos.add(new Estoque("Celular Motorola",11000.00, 2, 340.0));
		            
		            estoqueProdutos.add(new Estoque("Celular Xiaomi",13000.00, 2, 320.0));
		            
		            estoqueProdutos.remove(0);
		            
		           estoqueProdutos.set(0,new Estoque("Audi Q8",650.000, 1, 25000.0));
		            
		           for(Estoque i: estoqueProdutos) {
		        	   System.out.println(i);
		           }
		            
}
}
