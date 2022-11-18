package br.com.treinarecife.projetotreinarecife.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer idLead;
    private String nome;
    private String telefone;
    private Date dataCadastro;
    private String status;
    private Date novoContato;
    private String observacao;
    public Integer getIdLead() {
        return idLead;
    }
    public void setIdLead(Integer idLead) {
        this.idLead = idLead;
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
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getNovoContato() {
        return novoContato;
    }
    public void setNovoContato(Date novoContato) {
        this.novoContato = novoContato;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
