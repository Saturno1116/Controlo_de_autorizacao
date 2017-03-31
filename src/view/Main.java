package view;

import java.util.Scanner;

import controller.GereAutorizados;
import controller.GereCrianca;
import controller.GereEncarregado;
import model.Crianca;
import application.MockupData;
public class Main {

	public Main(){
	
	MenuPrincipal();	
	}


public void MenuPrincipal(){
	Scanner sc= new Scanner(System.in);
	Scanner sc2= new Scanner(System.in);
	GereCrianca gerecrianca = new GereCrianca();
	GereEncarregado gereencarregado = new GereEncarregado();
	
	int escolha=0;
	char let=' ';
	do{
	System.out.println("\n1- Inserção\n2- Exibir\n3-Sair ");
	escolha= sc.nextInt();
	switch(escolha){
	case 1:

 		System.out.println("\nInsira o nome da criança: ");
 		String nomeCri = sc2.nextLine();
 	    System.out.println("\nInsira a Data de Nascimento da Criança: ");
 		String dataNascimento = sc2.nextLine();
 		gerecrianca.addCrianca(nomeCri, dataNascimento);
 		System.out.println("------------ENCARREGADO------------");
		System.out.println("Insira o nome do Encarregado: ");
 		String nomeEnc = sc2.nextLine();
 	    System.out.println("Insira a Morada: ");
 		String moradaEnc = sc2.nextLine();
 		System.out.println("Insira o numero do Cartao de Cidadao: ");
 		int ccEnc = sc2.nextInt();
 		System.out.println("Insira o NIF: ");
 		int nifEnc = sc2.nextInt();
 		System.out.println("Insira o contacto: ");
 		int contactoEnc = sc2.nextInt();
 		System.out.println("Insira o NIB: ");
 		int nibEnc = sc2.nextInt();
 		System.out.println("Insira o Agregado Familiar da crianca: ");
 		String agregfamiliarEnc = sc.nextLine();
 		gereencarregado.addEncarregado(nomeEnc, moradaEnc, agregfamiliarEnc, ccEnc, nifEnc, contactoEnc, nibEnc);
		break;
	case 2:
		gerecrianca.showCriEncAut();
		
		break;
	case 3:
		let='y';
		
	}
	}while(let!='y');
}


}
