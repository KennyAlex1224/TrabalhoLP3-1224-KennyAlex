/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.academiaif.mapeamento.pessoa;

import src.academiaif.mapeamento.outros.CargoMapeamento;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "funcionarios")
public class FuncionarioMapeamento extends PessoaMapeamento implements Serializable{
    
    
    private CargoMapeamento cargoMapeamento;
    
    private int satisfacaoDoCliente;

    public CargoMapeamento getCargoMapeamento() {
        return cargoMapeamento;
    }

    public void setCargoMapeamento(CargoMapeamento cargoMapeamento) {
        this.cargoMapeamento = cargoMapeamento;
    }

    public int getSatisfacaoDoCliente() {
        return satisfacaoDoCliente;
    }

    public void setSatisfacaoDoCliente(int satisfacaoDoCliente) {
        this.satisfacaoDoCliente = satisfacaoDoCliente;
    }
    
    
}
