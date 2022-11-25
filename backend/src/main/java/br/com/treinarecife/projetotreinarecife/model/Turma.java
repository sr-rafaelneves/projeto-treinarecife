package br.com.treinarecife.projetotreinarecife.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTurma;

    @OneToMany
    @JoinColumn(name = "idAluno")
    private List<Aluno> alunos;

    private int idCurso;
    
    @OneToMany
    @JoinColumn(name= "idProfessor")
    private List<Professor> professores;


    private Double valor;
    private int seg;
    private int ter;
    private int qua;
    private int qui;
    private int sex;
    private int sab;

    public int getIdTurma() {
        return idTurma;
    }
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
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
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
