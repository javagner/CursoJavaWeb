package br.com.drogaria2.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria2.dao.ItemDAO;
import br.com.drogaria2.dao.ProdutoDAO;
import br.com.drogaria2.dao.VendaDAO;
import br.com.drogaria2.domain.Item;
import br.com.drogaria2.domain.Produto;
import br.com.drogaria2.domain.Venda;

public class ItemDAOTest {
	@Test
	@Ignore
	public void salvar() {
		VendaDAO vendaDao = new VendaDAO();
		Venda venda = vendaDao.buscarPorCodigo(20L);

		ProdutoDAO produtoDao = new ProdutoDAO();
		Produto produto = produtoDao.buscarPorCodigo(15L);

		Item item = new Item();
		item.setProduto(produto);
		item.setQuantidade(10);
		item.setValor(new BigDecimal(999.00));
		item.setVenda(venda);

		ItemDAO itemDao = new ItemDAO();
		itemDao.salvar(item);
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo(){
		ItemDAO itemDao = new ItemDAO();
		Item item = itemDao.buscarPorCodigo(23L);
		System.out.println(item);
	}
	
	@Test
	@Ignore
	public void listar(){
		ItemDAO itemDao = new ItemDAO();
		List<Item> itens = itemDao.listar();
		System.out.println(itens);
	}
	
	@Test
	@Ignore
	public void excluir(){
		ItemDAO itemDao = new ItemDAO();
		Item item = itemDao.buscarPorCodigo(24L);
		itemDao.excluir(item);
	}
	
	@Test
	public void editar(){
		ItemDAO itemDao = new ItemDAO();

		ProdutoDAO produtoDao = new ProdutoDAO();
		Produto produto = produtoDao.buscarPorCodigo(14L);
		VendaDAO vendaDao = new VendaDAO();
		Venda venda = vendaDao.buscarPorCodigo(20L);
	
		Item item = itemDao.buscarPorCodigo(22L);
		item.setQuantidade(30);
		item.setValor(new BigDecimal(1500.00D));
		item.setProduto(produto);
		item.setVenda(venda);
		
		itemDao.editar(item);
	}
}
