package model;

public class Autorizados 
{
	private String nome, morada, agregfamilia;
	private int cc, nif, contacto, nib, idAuto, id;
	
	public Autorizados(String nome, String morada, int cc, int nif, int contacto, int nib, String agregfamilia) 
	{
		super();
		this.nome = nome;
		this.morada = morada;
		this.cc = cc;
		this.nif = nif;
		this.contacto = contacto;
		this.nib = nib;
		this.agregfamilia= agregfamilia;
		
	}

	public String getAgregfamilia() {
		return agregfamilia;
	}
	public void setAgregfamilia(String agregfamilia) {
		this.agregfamilia = agregfamilia;
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

	public Autorizados(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
