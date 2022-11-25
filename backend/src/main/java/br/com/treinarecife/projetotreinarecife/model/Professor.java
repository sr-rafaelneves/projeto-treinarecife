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
@Table(name = "tb_professor")
public class Professor {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer idProfessor;
private String nome;
private String telefone;
private String valorhoraaula; 

@OneToMany
@JoinColumn(name= "idTurma")
private List<Turma> turmas;

public List<Turma> getTurmas() {
    return turmas;
}
public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
}
public Integer getIdProfessor() {
    return idProfessor;
}
public void setIdProfessor(Integer idProfessor) {
    this.idProfessor = idProfessor;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getValorhoraaula() {
    return valorhoraaula;
}
public void setValorhoraaula(String valorhoraaula) {
    this.valorhoraaula = valorhoraaula;
}


}
