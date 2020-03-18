package br.com.smipav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Imobiliaria {

	@Column(length = 50, nullable = false)
	private String nome_fantasia;
	
	@Column(length = 50, nullable = false)
	private String razao_social;
	
	@Column(length = 50, nullable = false)
	private String cnpj;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Usuario usuario;

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
