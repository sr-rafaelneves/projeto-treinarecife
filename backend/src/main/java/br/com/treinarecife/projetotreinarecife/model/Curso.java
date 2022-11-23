package br.com.treinarecife.projetotreinarecife.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descricao;
    private Double cargaHoraria;
    private Double cargaHorariaTotal;
    private String turno;
    private Double valor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Double getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }
    public void setCargaHorariaTotal(Double cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
