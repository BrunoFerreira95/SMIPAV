package br.com.smipav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
public class Usuario extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(length = 50, nullable = false)
	private String senha;
	
	@Column(length = 50, nullable = false)
	private String endereco;
	
	@Column(length = 50, nullable = false)
	private String telefone_celular;
	
	@Column(length = 50, nullable = false)
	private String status;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(String telefone_celular) {
		this.telefone_celular = telefone_celular;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
