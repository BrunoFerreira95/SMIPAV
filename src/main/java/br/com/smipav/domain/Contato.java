package br.com.smipav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contato extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String hora;
	
	@Column(length = 50, nullable = false)
	private String data;
	
	@Column(length = 50, nullable = false)
	private String conteudo;
	
	@Column(length = 50, nullable = false)
	private String assunto;
	
	@Column(length = 50, nullable = false)
	private String anexo;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Usuario usuario_origem;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Usuario usuario_destino;

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public Usuario getUsuario_origem() {
		return usuario_origem;
	}

	public void setUsuario_origem(Usuario usuario_origem) {
		this.usuario_origem = usuario_origem;
	}

	public Usuario getUsuario_destino() {
		return usuario_destino;
	}

	public void setUsuario_destino(Usuario usuario_destino) {
		this.usuario_destino = usuario_destino;
	}
	
}
