package br.com.smipav.daotest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.smipav.dao.UsuarioDao;
import br.com.smipav.domain.Usuario;

public class UsuarioDaoTest {
	
	@Test
	@Ignore
	public void salvar() {

		Usuario usuario = new Usuario();
		
		usuario.setEmail("brunoferreirapedraca@gmail.com");
		usuario.setEndereco("Francisco Robles Antonio,4560");
		usuario.setSenha("123456789");
		usuario.setStatus("ativo");
		usuario.setTelefone_celular("14998547777");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		usuarioDao.salvar(usuario);

		System.out.print("Usuario Salvo com Sucesso");
	}

	@Test
	@Ignore
	public void listar() {
		
		UsuarioDao usuarioDao = new UsuarioDao();

		List<Usuario> resultado = usuarioDao.listar();

		System.out.println("Total de registro: " + resultado.size());
		
		for( Usuario usuario : resultado) {
			System.out.println(usuario.getEmail());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.buscar(1L);
		
		System.out.println(usuario.getEmail());
	}
	
	@Test
	//@Ignore
	public void excluir() {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.buscar(2L);

		if (usuario == null) {
			System.out.println("Nenhum Registro encontrado");
		}else {
					
			usuarioDao.excluir(usuario);

			System.out.println("Registro encontrado");
			System.out.println("Registro Excluido");
		}

	}
	
	@Test
	@Ignore
	public void editar() {
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.buscar(1L);

		if (usuario == null) {
			
			System.out.println("Nenhum Registro encontrado");
			
		}else {
			
			usuario.setEmail("diegoferreira92@gmail.com");
			
			usuarioDao.editar(usuario);
			
			System.out.println("Registro encontrado");
			
			System.out.println("Registro Editado");
			
			System.out.println(usuario.getEmail());
		}

	}
}
