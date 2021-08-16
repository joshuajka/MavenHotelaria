package br.ufg.inf.fs20211.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hospede")

public class Hospede implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hospede")
	private Integer id_hospede;
	
	@Column(name="nm_hospede")
	private String nm_hospede;
	
	@Column(name="dt_nascimento")
	private Date dt_nascimento;
	
	@Column(name="cpf")
	private Integer cpf;

	public Hospede() {
		super();
	}

	public Hospede(Integer id_hospede, String nm_hospede, Date dt_nascimento, Integer cpf) {
		super();
		this.id_hospede = id_hospede;
		this.nm_hospede = nm_hospede;
		this.dt_nascimento = dt_nascimento;
		this.cpf = cpf;
	}

	public Integer getId_hospede() {
		return id_hospede;
	}

	public void setId_hospede(Integer id_hospede) {
		this.id_hospede = id_hospede;
	}

	public String getNm_hospede() {
		return nm_hospede;
	}

	public void setNm_hospede(String nm_hospede) {
		this.nm_hospede = nm_hospede;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Hospede [id_hospede=" + id_hospede + ", nm_hospede=" + nm_hospede + ", dt_nascimento=" + dt_nascimento
				+ ", cpf=" + cpf + "]";
	} 
	
	

}