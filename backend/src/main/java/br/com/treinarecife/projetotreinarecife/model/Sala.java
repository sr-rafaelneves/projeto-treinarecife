package br.com.treinarecife.projetotreinarecife.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sala")
public class Sala {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer idSala;
private String nome;
public Integer getIdSala() {
    return idSala;
}
public void setIdSala(Integer idSala) {
    this.idSala = idSala;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
    
}
