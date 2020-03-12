package br.com.smipav.main;

import org.hibernate.Session;

import br.com.smipav.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {

		Session sessao = HibernateUtil.getFabricaDeSesseoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSesseoes().close();
	}

}