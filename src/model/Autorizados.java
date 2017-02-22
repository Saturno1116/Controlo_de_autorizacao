package model;

public class Autorizados 
{
	private String nome, morada, agregfamiliar;
	private int cc, nif, contacto, nib;
	
	public Autorizados(String nome, String morada, int cc, int nif, int contacto, int nib, String agregfamiliar) 
	{
		super();
		this.nome = nome;
		this.morada = morada;
		this.cc = cc;
		this.nif = nif;
		this.contacto = contacto;
		this.nib = nib;
		this.agregfamiliar= agregfamiliar;
	}

	public String getAgregfamiliar() {
		return agregfamiliar;
	}
	public void setAgregfamiliar(String agregfamiliar) {
		this.agregfamiliar = agregfamiliar;
	}


	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	
	public String getMorada()
	{
		return morada;
	}

	public void setMorada(String morada) 
	{
		this.morada = morada;
	}

	public int getCc()
	{
		return cc;
	}

	public void setCc(int cc) 
	{
		this.cc = cc;
	}

	public int getNif()
	{
		return nif;
	}

	public void setNif(int nif) 
	{
		this.nif = nif;
	}

	public int getContacto() 
	{
		return contacto;
	}

	public void setContacto(int contacto) 
	{
		this.contacto = contacto;
	}

	public int getNib() 
	{
		return nib;
	}

	public void setNib(int nib)
	{
		this.nib = nib;
	}

}
