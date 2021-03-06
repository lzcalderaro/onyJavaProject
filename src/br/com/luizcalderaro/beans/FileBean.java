package br.com.luizcalderaro.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBFile")

public class FileBean
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private int idUser;
	private String name;
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getIdUser()
	{
		return idUser;
	}
	
	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}
}