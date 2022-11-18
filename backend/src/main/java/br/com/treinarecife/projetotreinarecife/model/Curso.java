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
    private int seg;
    private int ter;
    private int qua;
    private int qui;
    private int sex;
    private int sab;

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
    public int getSeg() {
        return seg;
    }
    public void setSeg(int seg) {
        this.seg = seg;
    }
    public int getTer() {
        return ter;
    }
    public void setTer(int ter) {
        this.ter = ter;
    }
    public int getQua() {
        return qua;
    }
    public void setQua(int qua) {
        this.qua = qua;
    }
    public int getQui() {
        return qui;
    }
    public void setQui(int qui) {
        this.qui = qui;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSab() {
        return sab;
    }
    public void setSab(int sab) {
        this.sab = sab;
    }


    
}
