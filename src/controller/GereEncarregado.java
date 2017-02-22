package controller;

import java.util.ArrayList;

import model.Encarregado;

public class GereEncarregado 
{
	ArrayList <Encarregado> arEncarregado;
	
	public GereEncarregado()
	{
		arEncarregado = new ArrayList<>();
	}
	
	public void addEncarregado(String nome, String morada,String agregfamiliar, int cc, int nif, int contacto, int nib)
	{
		Encarregado e = new Encarregado(nome, morada, nib, cc, nif, contacto, agregfamiliar);
	}
}
