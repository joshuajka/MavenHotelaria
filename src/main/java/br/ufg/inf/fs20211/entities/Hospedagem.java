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
@Table(name="tb_hospedagem")

public class Hospedagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hospedagem")
	private Integer id_hospedagem;
	
	@Column(name="id_quarto")
	private Integer id_quarto; 
	
	@Column(name="id_hospede")
	private Integer id_hospede; 
	
	@Column(name="dt_checkin")
	private Date dt_checkin;
	
	@Column(name="dt_checkout")
	private Date dt_checkout;

	public Hospedagem() {
		super();
	}

	public Hospedagem(Integer id_hospedagem, Integer id_quarto, Integer id_hospede, Date dt_checkin, Date dt_checkout) {
		super();
		this.id_hospedagem = id_hospedagem;
		this.id_quarto = id_quarto;
		this.id_hospede = id_hospede;
		this.dt_checkin = dt_checkin;
		this.dt_checkout = dt_checkout;
	}

	public Integer getId_hospedagem() {
		return id_hospedagem;
	}

	public void setId_hospedagem(Integer id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}

	public Integer getId_quarto() {
		return id_quarto;
	}

	public void setId_quarto(Integer id_quarto) {
		this.id_quarto = id_quarto;
	}

	public Integer getId_hospede() {
		return id_hospede;
	}

	public void setId_hospede(Integer id_hospede) {
		this.id_hospede = id_hospede;
	}

	public Date getDt_checkin() {
		return dt_checkin;
	}

	public void setDt_checkin(Date dt_checkin) {
		this.dt_checkin = dt_checkin;
	}

	public Date getDt_checkout() {
		return dt_checkout;
	}

	public void setDt_checkout(Date dt_checkout) {
		this.dt_checkout = dt_checkout;
	}

	@Override
	public String toString() {
		return "Hospedagem [id_hospedagem=" + id_hospedagem + ", id_quarto=" + id_quarto + ", id_hospede=" + id_hospede
				+ ", dt_checkin=" + dt_checkin + ", dt_checkout=" + dt_checkout + "]";
	}
	
	

}