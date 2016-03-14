package br.com.drogaria2.test;

import org.junit.Test;

import br.com.drogaria2.util.HibernateUtil;

public class GerarTabelaTest {
	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}
