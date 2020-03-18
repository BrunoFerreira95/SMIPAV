package br.com.smipav.daotest;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.smipav.dao.AdministradorDao;
import br.com.smipav.dao.ImobiliariaDao;
import br.com.smipav.dao.UsuarioDao;
import br.com.smipav.domain.Administrador;
import br.com.smipav.domain.Imobiliaria;
import br.com.smipav.domain.Usuario;

public class ImobialiariaDaoTest {

	@Test
	@Ignore
	public void salvar() {

		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = usuarioDao.buscar(1L);
		
		Imobiliaria imobiliaria = new Imobiliaria();
		
		imobiliaria.setUsuario(usuario);
		imobiliaria.setCnpj("123456789");
		imobiliaria.setNome_fantasia("Fio faculdade");
		imobiliaria.setRazao_social("123456asd");

		ImobiliariaDao imobiliariaDao = new ImobiliariaDao();

		imobiliariaDao.salvar(imobiliaria);

		System.out.print("Imobiliaria Salvo com Sucesso");
	}

	@Test
	@Ignore
	public void listar() {
		
		ImobiliariaDao imobiliariaDao = new ImobiliariaDao();

		List<Imobiliaria> resultado = imobiliariaDao.listar();

		System.out.println("Total de registro: " + resultado.size());
		
		for( Imobiliaria imobiliaria : resultado) {
			System.out.println(imobiliaria.getUsuario().getEmail());
			System.out.println("Listado");
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		ImobiliariaDao imobiliariaDao = new ImobiliariaDao();
		
		Imobiliaria imobiliaria = imobiliariaDao.buscar(1L);
		
		System.out.println(imobiliaria.getUsuario().getEmail());
	}
	
	@Test
	//@Ignore
	public void excluir() {
		ImobiliariaDao imobiliariaDao = new ImobiliariaDao();
		
		Imobiliaria imobiliaria = imobiliariaDao.buscar(2L);

		if (imobiliaria == null) {
			System.out.println("Nenhum Registro encontrado");
		}else {
			UsuarioDao usuarioDao = new UsuarioDao();
			
			Usuario usuario = new Usuario();
			
			usuario = usuarioDao.buscar(imobiliaria.getUsuario().getCodigo());
			
			imobiliariaDao.excluir(imobiliaria);
			
			usuarioDao.excluir(usuario);

			System.out.println("Registro encontrado");
			System.out.println("Registro Excluido");
		}

	}
	
	@Test
	@Ignore
	public void editar() {
		ImobiliariaDao imobiliariaDao = new ImobiliariaDao();
		
		Imobiliaria imobiliaria = imobiliariaDao.buscar(1L);

		if (imobiliaria == null) {
			
			System.out.println("Nenhum Registro encontrado");
			
		}else {
			imobiliaria.setNome_fantasia("FATEC OURINHOS");
			
			imobiliariaDao.editar(imobiliaria);
			
			System.out.println("Registro encontrado");
			
			System.out.println("Registro Editado");
			
			System.out.println(imobiliaria.getNome_fantasia());
		}

	}
}
