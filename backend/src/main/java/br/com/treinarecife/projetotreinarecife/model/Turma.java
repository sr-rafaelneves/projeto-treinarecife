package br.com.treinarecife.projetotreinarecife.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    @OneToOne
    @JoinColumn(name= "idCurso")
    private Curso curso;
    
    public Curso getCurso() {
        return curso;
    }
    public void setCursos(Curso curso) {
        this.curso = curso;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor (Professor professor) {
        this.professor = professor;
    }
    @OneToOne
    @JoinColumn(name= "idProfessor")
    private Professor professor;


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
