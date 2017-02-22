package controller;

import java.util.ArrayList;

import model.Autorizados;

public class GereAutorizados 
{
	ArrayList <Autorizados> arAutorizados;
	
	public GereAutorizados()
	{
		arAutorizados = new ArrayList<>();
	}
	
	public void addEncarregado(String nome, String morada,String agregfamilia, int cc, int nif, int contacto, int nib)
	{
		Autorizados d = new Autorizados(nome, morada, nib, cc, nif, contacto, agregfamilia);
	}
}
