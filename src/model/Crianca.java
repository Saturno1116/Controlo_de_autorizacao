package model;

import java.util.ArrayList;

public class Crianca 
{
	private int idAuto;
	private String nome;
	private String dataNascimento;
	ArrayList<Encarregado>arEncarregado;
	ArrayList<Autorizados>arAutorizados;
	public Crianca(String nome, String dataNascimento,ArrayList<Encarregado> arEncarregado, ArrayList<Autorizados> arAutorizados) {
		super();
		this.idAuto= idAuto;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.arEncarregado = arEncarregado;
		this.arAutorizados = arAutorizados;
	}
	public String getNome() {
		return nome;
	}
	public ArrayList<Encarregado> getArEncarregado() {
		return arEncarregado;
	}
	public void setArEncarregado(ArrayList<Encarregado> arEncarregado) {
		this.arEncarregado = arEncarregado;
	}
	public ArrayList<Autorizados> getArAutorizados() {
		return arAutorizados;
	}
	public void setArAutorizados(ArrayList<Autorizados> arAutorizados) {
		this.arAutorizados = arAutorizados;
	}
	public Crianca(ArrayList<Encarregado> arEncarregado, ArrayList<Autorizados> arAutorizados) {
		super();
		this.arEncarregado = arEncarregado;
		this.arAutorizados = arAutorizados;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}
	
	
	
}
