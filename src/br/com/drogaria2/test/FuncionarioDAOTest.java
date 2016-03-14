package br.com.drogaria2.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria2.dao.FuncionarioDAO;
import br.com.drogaria2.domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	public void salvar(){
		//Funcionario fun1 = new Funcionario();
		//fun1.setCpf("042.066.673-73");
		//fun1.setFuncao("Desenvolvedor");
		//fun1.setNome("Marcelo Vale");
		//fun1.setSenha("12345");
		
		Funcionario fun2 = new Funcionario();
		fun2.setCpf("053.978.646-97");
		fun2.setFuncao("Programador");
		fun2.setNome("João Doido");
		fun2.setSenha("54321");
		
		Funcionario fun3 = new Funcionario();
		fun3.setCpf("023.456.768-97");
		fun3.setFuncao("Analista");
		fun3.setNome("Jonh Silva");
		fun3.setSenha("54321");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.salvar(fun2);
		dao.salvar(fun3);
	}
	
	@Test
	@Ignore
	public void listar(){
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> funcionarios = dao.listar();
		
		System.out.println(funcionarios);
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo(){
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario fun1 = dao.buscarPorCodigo(7L);
		Funcionario fun2 = dao.buscarPorCodigo(11L);
		
		System.out.println(fun1);
		System.out.println(fun2);
	}
	
	@Test
	@Ignore
	public void excluir(){
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario funcionario = dao.buscarPorCodigo(11L);
		dao.excluir(funcionario);
	}
	
	@Test
	@Ignore
	public void editar(){
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario funcionario = dao.buscarPorCodigo(7L);
		
		funcionario.setCpf("042.066.673-73");
		funcionario.setFuncao("Desenvolvedor Java");
		funcionario.setNome("Marcelo Vale");
		funcionario.setSenha("12345");
		
		dao.editar(funcionario);
	}
}
