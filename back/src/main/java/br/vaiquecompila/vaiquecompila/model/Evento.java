package br.vaiquecompila.vaiquecompila.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="itmn_evento")
public class Evento {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int id;
	
	@Column(name="data_evt")
	private Date dataevt;

    @OneToOne
    @JoinColumn(name = "id_alarme")
    private Alarme alarme;

    @OneToOne
    @JoinColumn(name = "id_equip")
    private Equipamento equipamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataevt() {
        return dataevt;
    }

    public void setDataevt(Date dataevt) {
        this.dataevt = dataevt;
    }

    public Alarme getAlarme() {
        return alarme;
    }

    public void setAlarme(Alarme alarme) {
        this.alarme = alarme;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}