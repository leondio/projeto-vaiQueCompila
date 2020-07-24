package br.vaiquecompila.vaiquecompila.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn_alarme")
public class Alarme {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_alarme")
	private int id_alarme;
	
	@Column(name="nome", length=100, nullable=false)
	private String nome;
	
	@Column(name="descricao", length=200)
	private String descricao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_alarme() {
        return id_alarme;
    }

    public void setId_alarme(int id_alarme) {
        this.id_alarme = id_alarme;
    }
}