package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Crianca;
import model.Encarregado;

public class GereEncarregado 
{
	ArrayList <Encarregado> arEncarregado;
	
	public GereEncarregado()
	{
		arEncarregado = new ArrayList<>();
		addEncarregado(null, null, null, 0, 0, 0, 0);
	}
	
	public Encarregado addEncarregado(String nome, String morada,String agregfamiliar, int cc, int nif, int contacto, int nib){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Encarregado> arEncarregado = new ArrayList<Encarregado>();
		
		Encarregado e = new Encarregado(nome, morada, nib, cc, nif, contacto, agregfamiliar);
		int novoId = arEncarregado.size();

		System.out.println("Insira o nome do Encarregado: ");
 		nome = sc.nextLine();
 	    System.out.println("Insira a Morada: ");
 		morada = sc.nextLine();
 		System.out.println("Insira o numero do Cartao de Cidadao: ");
 		cc = sc.nextInt();
 		System.out.println("Insira o NIF: ");
 		nif = sc.nextInt();
 		System.out.println("Insira o contacto: ");
 		contacto = sc.nextInt();
 		System.out.println("Insira o NIB: ");
 		nib = sc.nextInt();
 		System.out.println("Insira o Agregado Familiar da crianca: ");
 		agregfamiliar = sc.nextLine();
 		
 		e.setNome(nome);
		e.setMorada(morada);
		e.setCc(cc);
		e.setNif(nif);
		e.setContacto(contacto);
		e.setNib(nib);
		e.setAgregfamiliar(agregfamiliar);
		
		e.setId(novoId);
		arEncarregado.add(e);

	          
	     return e;
	 	
	    
	}
}
