package controller;

import java.util.ArrayList;
import java.util.Scanner;


import model.Autorizados;
import model.Crianca;
import model.Encarregado;


public class GereCrianca 
{
	public static ArrayList <Crianca> arCrianca;
	
	public GereCrianca()
	{
		arCrianca = new ArrayList<>();
		addCrianca(null, null, null, null);
	}
	
	public Crianca addCrianca(String nome, String dataNascimento,ArrayList<Encarregado> arEncarregado, ArrayList<Autorizados> arAutorizados){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Crianca> arCrianca = new ArrayList<Crianca>();
		
		Crianca c = new Crianca(nome, dataNascimento, arEncarregado, arAutorizados);
		int novoId = arCrianca.size();

 		System.out.println("Insira o nome da criança: ");
 		nome = sc.nextLine();
 	    System.out.println("Insira a Data de Nascimento da Criança: ");
 		dataNascimento = sc.nextLine();
 		
 		c.setNome(nome);
		c.setDataNascimento(dataNascimento);
		
		c.setIdAuto(novoId);
		arCrianca.add(c);

	          
	     return c;
	 	
	    	
	   
	     
	}
}
