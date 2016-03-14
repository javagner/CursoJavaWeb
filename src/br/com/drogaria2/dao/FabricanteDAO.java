package br.com.drogaria2.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.drogaria2.domain.Fabricante;
import br.com.drogaria2.util.HibernateUtil;

public class FabricanteDAO {
	//Cria uma sess�o que tornar� poss�vel a captura de dados para
	//inser��o no banco.
	public void salvar(Fabricante fabricante){
		//abre sess�o
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		//Cria uma transa��o vazia.
		Transaction transacao = null;
		
		//Realiza transa��o ou uma exce��o pode ser capturada
		try{
			transacao = sessao.beginTransaction();
			sessao.save(fabricante);
			transacao.commit();
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback();
			}
			throw ex;
		}finally{
			sessao.close();
		}

	}
	
	//listar os dados da tabela, sele��o
	@SuppressWarnings("unchecked")
	public List<Fabricante> listar(){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Fabricante> fabricantes = null;
		try{
			Query consulta = sessao.getNamedQuery("Fabricante.listar");
			fabricantes = consulta.list();
		}catch(RuntimeException ex){
			throw ex;
		}finally{
			sessao.close();
		}
		return fabricantes;
	}
	
	//pesquisa fabricante por c�digo no banco
	public Fabricante buscarPorCodigo(Long codigo){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Fabricante fabricante = null;
		try{
			Query consulta = sessao.getNamedQuery("Fabricante.buscarPorCodigo");
			consulta.setLong("codigo", codigo);
			
			fabricante = (Fabricante) consulta.uniqueResult();
		}catch(RuntimeException ex){
			throw ex;
		}finally{
			sessao.close();
		}
		return fabricante;
	}
	
	//Excluir do banco atrav�s do c�digo
	public void excluir(Fabricante fabricante){
		//abre sess�o
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		//Cria uma transa��o vazia.
		Transaction transacao = null;
		
		//Realiza transa��o ou uma exce��o pode ser capturada
		try{
			transacao = sessao.beginTransaction();
			sessao.delete(fabricante);
			transacao.commit();
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback();
			}
			throw ex;
		}finally{
			sessao.close();
		}

	}
	
	//M�todo Editar Fabricante.
	public void editar(Fabricante fabricante){
		//abre sess�o
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		//Cria uma transa��o vazia.
		Transaction transacao = null;
		
		//Realiza transa��o ou uma exce��o pode ser capturada
		try{
			transacao = sessao.beginTransaction();
			sessao.update(fabricante);
			transacao.commit();
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback();
			}
			throw ex;
		}finally{
			sessao.close();
		}

	}
}
