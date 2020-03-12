package br.com.smipav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario{
	
	public Administrador(String email, String senha, String endereco, String telefone_celular, String status) {
		super(email, senha, endereco, telefone_celular, status);
		// TODO Auto-generated constructor stub
	}
	
}
