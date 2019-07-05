/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.academiaif.repository;

import java.util.List;
import src.academiaif.mapeamento.outros.PlanoMapeamento;
import src.academiaif.dao.Conexao;

/**
 *
 * @author Frank
 */
public class PlanoRepository extends Conexao{
    
    public void salvar(PlanoMapeamento plano){
        Conectar();
        getSession().save(plano);
        Fechar();
    }
    
    public void excluir(int codExcluir){
        Conectar();
        
       getSession().createQuery("DELETE FROM planos WHERE idPlano = " + codExcluir + ";");
        
        Fechar();
    }

    public List<PlanoMapeamento> buscarTodos(){
        List<PlanoMapeamento> listaDePlanos;
        Conectar();
        listaDePlanos = getSession().createQuery("from PlanoMapeamento").list();
        Fechar();
        return listaDePlanos;
    }
}
