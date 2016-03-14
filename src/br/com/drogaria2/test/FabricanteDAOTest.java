package br.com.drogaria2.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria2.dao.FabricanteDAO;
import br.com.drogaria2.domain.Fabricante;

public class FabricanteDAOTest {
	//Teste Salvar
	@Test
	@Ignore
	public void salvar(){
		Fabricante f1 = new Fabricante();
		f1.setDescricao("DESCRICÂO A");
		
		Fabricante f2 = new Fabricante();
		f2.setDescricao("DESCRIÇÂO B");
		
		FabricanteDAO dao = new FabricanteDAO();
		
		dao.salvar(f1);
		dao.salvar(f2);
	}
	
	//Teste listar
	@Test
	@Ignore
	public void listar(){
		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> fabricantes = dao.listar();
		
			System.out.println(fabricantes);
	
	}
	
	//Test busca por código
	@Test
	public void buscarPorCodigo(){
		FabricanteDAO dao = new FabricanteDAO();
		
		Fabricante f1 = dao.buscarPorCodigo(5L);
		Fabricante f2 = dao.buscarPorCodigo(6L);
	
		System.out.println(f1);
		System.out.println(f2);
	}
	
	@Test
	@Ignore
	public void excluir(){
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante = dao.buscarPorCodigo(6L);
		
		dao.excluir(fabricante);
	}
	
	//Método para editar/atualizar os dados na tabela

	@Test
	public void editar(){
		FabricanteDAO dao = new FabricanteDAO();
		Fabricante fabricante1 = dao.buscarPorCodigo(5L);
		fabricante1.setDescricao("MOTOROLA");
		dao.editar(fabricante1);
			
		Fabricante fabricante2 = dao.buscarPorCodigo(12L);
		fabricante2.setDescricao("SAMSUNG");
		dao.editar(fabricante2);
	
		Fabricante fabricante3 = dao.buscarPorCodigo(13L);
		fabricante3.setDescricao("SONY");
		dao.editar(fabricante3);
	}
}
