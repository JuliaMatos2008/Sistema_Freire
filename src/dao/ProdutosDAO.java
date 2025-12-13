/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JmfProdutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u08317670147
 */
public class ProdutosDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction(). commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction(). commit();
        session.flush();
        session.clear();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction(). commit();
        session.flush();
        session.clear();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        criteria.add(Restrictions.eq("jmfIdProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;

        
    }
    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
<<<<<<< HEAD
        criteria.add(Restrictions.like("jmfNome", "%" + nome + "%"));
=======
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
>>>>>>> 210de04fcefc1d3f2b1722bfae5cea51a31e4592
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
<<<<<<< HEAD
    public Object listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        criteria.add(Restrictions.ge("jmfPreco", valor));
=======
    public Object listValor(double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        criteria.add(Restrictions.ge("valorUnitario", valorUnitario));
>>>>>>> 210de04fcefc1d3f2b1722bfae5cea51a31e4592
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
<<<<<<< HEAD
     public Object listNomeValor(String nome, double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        criteria.add(Restrictions.like("jmfNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("jmfPreco", valor));
=======
     public Object listNomeValor(String nome, double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        criteria.add(Restrictions.like("nome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("valorUnitario", valorUnitario));
>>>>>>> 210de04fcefc1d3f2b1722bfae5cea51a31e4592
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmfProdutos.class);
        List lista = criteria.list();
        session.getTransaction(). commit();
        return lista;
    }
    
    
}
