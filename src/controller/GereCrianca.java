package controller;

import java.util.ArrayList;

import model.Autorizados;
import model.Crianca;
import model.Encarregado;

public class GereCrianca 
{
	public static ArrayList <Crianca> arCrianca;
	public static ArrayList<Encarregado>arEncarregado;
	public static ArrayList <Autorizados> arAutorizados;
	
	public GereCrianca()
	{
		arCrianca = new ArrayList<>();	
		arEncarregado= new ArrayList<>();
		arAutorizados= new ArrayList<>();
	}
	
	public void addCrianca(String nome, String dataNascimento){		

		Crianca crianca = new Crianca(nome, dataNascimento, arEncarregado, arAutorizados);
		arCrianca.add(crianca);
	}
		
	public void addEncarregado(String nome) {
		for(Crianca crianca: arCrianca){
			if(crianca.getNome().equals(nome)){
				crianca.setArEncarregado(arEncarregado);
			}
		}		
	}
	
	public void showCriEncAut(){
		for(Crianca crianca : arCrianca){
			imprime(crianca);
		}
		
	}
	public void imprime(Crianca crianca){
        System.out.println("Nome: " + crianca.getNome());
        System.out.println("\nData de Nascimento: " + crianca.getDataNascimento());

		
	}

}
/*  public void insereExposicao(String nome, String data_i, String data_f, float preco){
ArrayList<Obra> obras=new ArrayList();  
Exposicao exposicao=new Exposicao(nome, data_i, data_f, preco, obras);
exposicoes.add(exposicao);}

    public void inserirObrasExposição(String nome, Obra obra){
         for (Exposicao exposicao:exposicoes){
             if(exposicao.getNome().equals(nome)){
                 exposicao.setObras(obra);}}
                 
                 
   public void listarObras(ArrayList<Obra> obras){
         for(Obra obra:obras){
            imprime(obra);
         }
     }
     
     public void imprime(Obra obra){
        System.out.println("Título..............." + obra.getTitulo());
        System.out.println("Artista.............." + obra.getArtista());
        System.out.println("Categoria............" + obra.getCategoria());
        System.out.println("Data................." + obra.getData());
     }                
                 
                 
*/