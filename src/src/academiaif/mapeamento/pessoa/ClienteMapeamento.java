/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.academiaif.mapeamento.pessoa;

import src.academiaif.mapeamento.outros.PlanoMapeamento;
import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "clientes")
public class ClienteMapeamento extends PessoaMapeamento implements Serializable {

    
    private String planoMapeamento;
    
    @Column(nullable = false)
    private int diaVencimento;

    public String getPlanoMapeamento() {
        return planoMapeamento;
    }

    public void setPlanoMapeamento(String planoMapeamento) {
        this.planoMapeamento = planoMapeamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

}
