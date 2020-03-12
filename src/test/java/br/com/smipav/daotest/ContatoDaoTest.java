package br.com.smipav.daotest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.smipav.dao.ContatoDao;
import br.com.smipav.dao.UsuarioDao;
import br.com.smipav.domain.Contato;
import br.com.smipav.domain.Usuario;

public class ContatoDaoTest {

	@Test
	@Ignore
	public void salvar() {

		Contato contato = new Contato();

		contato.setAnexo("hello.pdf");
		contato.setAssunto("Comprar casa");
		contato.setConteudo("linguagem de programação");
		contato.setData("2020-3-12");
		contato.setHora("16:20");

		UsuarioDao usuarioDao = new UsuarioDao();

		Usuario usuario_origem = new Usuario();

		usuario_origem = usuarioDao.buscar(1L);

		Usuario usuario_destino = new Usuario();

		usuario_destino = usuarioDao.buscar(2L);
		
		contato.setUsuario_origem(usuario_origem);
		
		contato.setUsuario_destino(usuario_destino);

		ContatoDao contatoDao = new ContatoDao();

		contatoDao.salvar(contato);

		System.out.print("Contato Salvo com Sucesso");
	}

	@Test
	@Ignore
	public void listar() {

		ContatoDao contatoDao = new ContatoDao();

		List<Contato> resultado = contatoDao.listar();

		System.out.println("Total de registro: " + resultado.size());

		for (Contato contato : resultado) {
			System.out.println(contato.getAssunto());
		}
	}

	@Test
	@Ignore
	public void buscar() {

		ContatoDao contatoDao = new ContatoDao();

		Contato contato = contatoDao.buscar(1L);

		System.out.println(contato.getAssunto());
	}

	@Test
	// @Ignore
	public void excluir() {
		ContatoDao contatoDao = new ContatoDao();

		Contato contato = contatoDao.buscar(1L);

		if (contato == null) {
			System.out.println("Nenhum Registro encontrado");
		} else {

			contatoDao.excluir(contato);

			System.out.println("Registro encontrado");
			System.out.println("Registro Excluido");
		}

	}

	@Test
	@Ignore
	public void editar() {
		ContatoDao contatoDao = new ContatoDao();

		Contato contato = contatoDao.buscar(1L);

		if (contato == null) {

			System.out.println("Nenhum Registro encontrado");

		} else {

			contato.getAssunto("Segunda Etapa");

			contatoDao.editar(contato);

			System.out.println("Registro encontrado");

			System.out.println("Registro Editado");

			System.out.println(contato.getAssunto());
		}

	}
}
