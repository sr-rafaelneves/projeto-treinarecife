package br.com.treinarecife.projetotreinarecife.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_feriado")
public class Feriado {

    private Date dataFeriado;
    private String descricao;

    public Date getDataFeriado() {
        return dataFeriado;
    }
    public void setDataFeriado(Date dataFeriado) {
        this.dataFeriado = dataFeriado;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
