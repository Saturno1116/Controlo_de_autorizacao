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
	
	}
	
	public Encarregado addEncarregado(String nome, String morada,String agregfamiliar, int cc, int nif, int contacto, int nib){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Encarregado> arEncarregado = new ArrayList<Encarregado>();
		
		Encarregado e = new Encarregado(nome, morada, nib, cc, nif, contacto, agregfamiliar);

		arEncarregado.add(e);

	          
	     return e;
	 	
	    
	}
}
