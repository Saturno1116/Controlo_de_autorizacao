package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Autorizados;
import model.Crianca;

public class GereAutorizados 
{
	ArrayList <Autorizados> arAutorizados;
	
	public GereAutorizados()
	{
		arAutorizados = new ArrayList<>();
		addAutorizado(null, null, null, 0, 0, 0, 0);
	}
	
	public Autorizados addAutorizado(String nome, String morada,String agregfamilia, int cc, int nif, int contacto, int nib)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Autorizados> arAutorizados = new ArrayList<Autorizados>();
		Autorizados d = new Autorizados( nome,  morada,  cc, nif,  contacto,  nib, agregfamilia);
		
	    int novoId = arAutorizados.size();

 		System.out.println("Insira o nome do Autorizado: ");
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
 		agregfamilia = sc.nextLine();
 		
 		d.setNome(nome);
		d.setMorada(morada);
		d.setCc(cc);
		d.setNif(nif);
		d.setContacto(contacto);
		d.setNib(nib);
		d.setAgregfamilia(agregfamilia);
		
		d.setId(novoId);
		arAutorizados.add(d);

	          
	     return d;
	 	
	    
	
	
	   
	}
}
