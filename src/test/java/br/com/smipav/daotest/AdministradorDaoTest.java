package br.com.smipav.daotest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.smipav.dao.AdministradorDao;
import br.com.smipav.domain.Administrador;

public class AdministradorDaoTest {

	@Test
	//@Ignore
	public void salvar() {

		Administrador administrador = new Administrador(
				"brunofpedraca@gmail.com",
				"root",
				"Francisco Robles",
				"123456789",
				"1"
		);

		AdministradorDao administradorDao = new AdministradorDao();

		administradorDao.salvar(administrador);

		System.out.print("Administrador Salvo com Sucesso");
	}

	@Test
	//@Ignore
	public void listar() {
		
		AdministradorDao administradorDao = new AdministradorDao();

		List<Administrador> resultado = administradorDao.listar();

		System.out.println("Total de registro: " + resultado.size());
		
		for( Administrador administrador : resultado) {
			System.out.println(administrador.getEmail());
		}
	}
	
	@Test
	//@Ignore
	public void buscar() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		
		Administrador administrador = administradorDao.buscar(1L);
		
		System.out.println(administrador.getEmail());
	}
	
	@Test
	//@Ignore
	public void excluir() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		System.out.println("teste");
		Administrador administrador = administradorDao.buscar(1L);

		if (administrador == null) {
			System.out.println("Nenhum Registro encontrado");
		}else {
			
			administradorDao.excluir(administrador);
			System.out.println("Registro encontrado");
			System.out.println(administrador.getEmail());
		}

	}
	
	@Test
	//@Ignore
	public void editar() {
		
		AdministradorDao administradorDao = new AdministradorDao();
		
		Administrador administrador = administradorDao.buscar(1L);

		if (administrador == null) {
			
			System.out.println("Nenhum Registro encontrado");
			
		}else {
			administrador.setEmail("diegonovello@hotmail.com");;
			administradorDao.editar(administrador);
			System.out.println("Registro encontrado");
			System.out.println(administrador.getEmail());
		}

	}
}
