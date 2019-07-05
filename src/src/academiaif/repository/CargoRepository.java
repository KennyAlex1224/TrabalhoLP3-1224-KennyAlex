/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.academiaif.repository;

import java.util.List;
import src.academiaif.mapeamento.outros.CargoMapeamento;
import src.academiaif.dao.Conexao;

/**
 *
 * @author Frank
 */
public class CargoRepository extends Conexao{
    
    public void salvar(CargoMapeamento cargo){
        Conectar();
        getSession().save(cargo);
        Fechar();
    }
    
    public List<CargoMapeamento> buscarTodos(){
        List<CargoMapeamento> listaDeCargos;
        Conectar();
        listaDeCargos = getSession().createQuery("from CargoMapeamento").list();
        Fechar();
        return listaDeCargos;
    }
}
