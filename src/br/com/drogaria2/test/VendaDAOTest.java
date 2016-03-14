package br.com.drogaria2.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria2.dao.FuncionarioDAO;
import br.com.drogaria2.dao.VendaDAO;
import br.com.drogaria2.domain.Funcionario;
import br.com.drogaria2.domain.Venda;

public class VendaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		// Funcionario funcionario = funcionarioDAO.buscarPorCodigo(7L);
		Funcionario funcionario1 = funcionarioDAO.buscarPorCodigo(18L);
		Funcionario funcionario2 = funcionarioDAO.buscarPorCodigo(19L);

		Venda venda1 = new Venda();
		venda1.setFuncionario(funcionario1);
		venda1.setHorario(new Date());
		venda1.setValor(new BigDecimal(800.00D));

		Venda venda2 = new Venda();
		venda2.setFuncionario(funcionario2);
		venda2.setHorario(new Date());
		venda2.setValor(new BigDecimal(500.00D));

		VendaDAO vendaDao = new VendaDAO();
		vendaDao.salvar(venda1);
		vendaDao.salvar(venda2);

	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		VendaDAO vendaDao = new VendaDAO();
		Venda venda = vendaDao.buscarPorCodigo(20L);
		System.out.println(venda);
	}

	@Test
	@Ignore
	public void listar() {
		VendaDAO vendaDao = new VendaDAO();
		List<Venda> vendas = vendaDao.listar();
		System.out.println(vendas);
	}

	@Test
	@Ignore
	public void excluir() {
		VendaDAO vendaDao = new VendaDAO();
		Venda venda = vendaDao.buscarPorCodigo(21L);
		vendaDao.excluir(venda);
	}

	@Test
	public void editar() {
		VendaDAO vendaDao = new VendaDAO();
		Venda venda = vendaDao.buscarPorCodigo(20L);
		venda.setValor(new BigDecimal(1500.00D));

		FuncionarioDAO funcionarioDao = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDao.buscarPorCodigo(19L);
		venda.setFuncionario(funcionario);

		vendaDao.editar(venda);
	}
}
