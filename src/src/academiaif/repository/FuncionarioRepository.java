/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.academiaif.repository;

import java.util.List;
import src.academiaif.mapeamento.pessoa.FuncionarioMapeamento;
import src.academiaif.dao.Conexao;

/**
 *
 * @author Frank
 */
public class FuncionarioRepository extends Conexao{
    
    public void salvar(FuncionarioMapeamento funcionario){
        Conectar();
        getSession().save(funcionario);
        Fechar();
    }
    
    public List<FuncionarioMapeamento> buscarTodos(){
        List<FuncionarioMapeamento> listaDeFuncionarios;
        Conectar();
        listaDeFuncionarios = getSession().createQuery("from FuncionarioMapeamento").list();
        Fechar();
        return listaDeFuncionarios;
    }
}
