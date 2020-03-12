package br.com.smipav.daotest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.smipav.dao.AdministradorDao;
import br.com.smipav.dao.UsuarioDao;
import br.com.smipav.domain.Administrador;
import br.com.smipav.domain.Usuario;

public class AdministradorDaoTest {

	@Test
	@Ignore
	public void salvar() {

		
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.buscar(1L);
		
		Administrador administrador = new Administrador();
		
		administrador.setUsuario(usuario);

		AdministradorDao administradorDao = new AdministradorDao();

		administradorDao.salvar(administrador);

		System.out.print("Administrador Salvo com Sucesso");
	}

	@Test
	@Ignore
	public void listar() {
		
		AdministradorDao administradorDao = new AdministradorDao();

		List<Administrador> resultado = administradorDao.listar();

		System.out.println("Total de registro: " + resultado.size());
		
		for( Administrador administrador : resultado) {
			System.out.println(administrador.getUsuario().getEmail());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		
		Administrador administrador = administradorDao.buscar(1L);
		
		System.out.println(administrador.getUsuario().getEmail());
	}
	
	@Test
	//@Ignore
	public void excluir() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		
		Administrador administrador = administradorDao.buscar(2L);

		if (administrador == null) {
			System.out.println("Nenhum Registro encontrado");
		}else {
			UsuarioDao usuarioDao = new UsuarioDao();
			
			Usuario usuario = new Usuario();
			
			usuario = usuarioDao.buscar(administrador.getUsuario().getCodigo());
			
			administradorDao.excluir(administrador);
			
			usuarioDao.excluir(usuario);

			System.out.println("Registro encontrado");
			System.out.println("Registro Excluido");
		}

	}
	
	@Test
	@Ignore
	public void editar() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		
		Administrador administrador = administradorDao.buscar(1L);

		if (administrador == null) {
			
			System.out.println("Nenhum Registro encontrado");
			
		}else {
			UsuarioDao usuarioDao = new UsuarioDao();
			
			Usuario usuario = new Usuario();
			
			usuario = administrador.getUsuario();
			
			usuario.setEmail("diegoferreira92@gmail.com");
			
			usuarioDao.editar(usuario);
			
			System.out.println("Registro encontrado");
			
			System.out.println("Registro Editado");
			
			System.out.println(administrador.getUsuario().getEmail());
		}

	}
}
