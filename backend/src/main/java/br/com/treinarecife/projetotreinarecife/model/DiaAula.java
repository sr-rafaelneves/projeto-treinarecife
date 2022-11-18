package br.com.treinarecife.projetotreinarecife.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diaaula")
public class DiaAula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numCurso;
    private Date dataAula;
    public Integer getNumCurso() {
        return numCurso;
    }
    public void setNumCurso(Integer numCurso) {
        this.numCurso = numCurso;
    }
    public Date getDataAula() {
        return dataAula;
    }
    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }
}
