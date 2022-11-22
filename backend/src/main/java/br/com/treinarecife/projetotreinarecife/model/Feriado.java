package br.com.treinarecife.projetotreinarecife.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_feriado")
public class Feriado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private int id;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Feriado(int id, String descricao, Date dataFeriado ){
        this.id = id;
        this.descricao = descricao;
        this.dataFeriado = dataFeriado;
    }
  
    
    
}
