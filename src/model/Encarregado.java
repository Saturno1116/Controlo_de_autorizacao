package model;

public class Encarregado 
{
	private String nome, morada;
	private int cc, nif, contacto, nib;
	
	public Encarregado(String nome, String morada, int cc, int nif, int contacto, int nib) 
	{
		super();
		this.nome = nome;
		this.morada = morada;
		this.cc = cc;
		this.nif = nif;
		this.contacto = contacto;
		this.nib = nib;
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
