package controller;

import java.util.ArrayList;
import model.Crianca;

public class GereCrianca 
{
	ArrayList <Crianca> arCrianca;
	
	public GereCrianca()
	{
		arCrianca = new ArrayList<>();
	}
	
	public void addCrianca(String nome, String dataNascimento)
	{
		Crianca c = new Crianca(nome, dataNascimento);
	}
}
