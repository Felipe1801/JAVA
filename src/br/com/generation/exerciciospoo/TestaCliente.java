package br.com.generation.exerciciospoo;

import java.util.Scanner;

public class TestaCliente {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	
		Cliente usuario = new Cliente();
		
		System.out.println("Digite seu nome: ");
		usuario.setnome(entrada.next());
		
		System.out.println("Digite sua idade: ");
		usuario.setidade(entrada.nextInt());
		
		System.out.println("Digite sua cor: ");
		usuario.setCor(entrada.next());
		
		System.out.println("Digite seu genero: ");
		usuario.setgenero(entrada.next());
		
		System.out.println(usuario.getnome());
		System.out.println(usuario.getidade());
		System.out.println(usuario.getcor());
		System.out.println(usuario.getgenero());

	}

		
		

	}


