package br.com.drogaria2.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria2.dao.FabricanteDAO;
import br.com.drogaria2.dao.ProdutoDAO;
import br.com.drogaria2.domain.Fabricante;
import br.com.drogaria2.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscarPorCodigo(13L);
		
		Produto produto = new Produto();
		produto.setDescricao("Xperia Z3 Compact");
		produto.setPreco(new BigDecimal(1799.00D));
		produto.setQuantidade(10);
		produto.setFabricante(fabricante);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = produtoDAO.buscarPorCodigo(15L);
		
		System.out.println(produto);
	}
	
	@Test
	@Ignore
	public void listar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		List<Produto> produtos = produtoDAO.listar();
	
		System.out.println(produtos);
	}
	
	@Test
	@Ignore
	public void excluir(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscarPorCodigo(16L);
		produtoDAO.excluir(produto);
		
	}
	
	@Test
	public void editar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = produtoDAO.buscarPorCodigo(15L);
		produto.setDescricao("Galaxy J3");
		produto.setPreco(new BigDecimal(999.00D));
		produto.setQuantidade(60);
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscarPorCodigo(12L);
		produto.setFabricante(fabricante);
		
		produtoDAO.editar(produto);
	}
}
