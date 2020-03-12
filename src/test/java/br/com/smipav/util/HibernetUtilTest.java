package br.com.smipav.util;

import javax.persistence.Temporal;

import org.hibernate.Session;
import org.junit.Test;

public class HibernetUtilTest {
	
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSesseoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSesseoes().close();
	}
}