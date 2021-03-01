package com.erick.demo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="aud_imagen")
public class AudImagen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Long area;

	private Long codigo;

	@Column(name="estado_d")
	private Integer estadoD;

	@Column(name="estado_u")
	private Integer estadoU;

	private Integer estadoinformes;

	@Column(name="fec_ini")
	private Timestamp fecIni;

	@Column(name="fec_upd")
	private Timestamp fecUpd;

	@Column(name="first_user")
	private String firstUser;

	private Long historia;

	@Column(name="last_user")
	private String lastUser;

	@Column(name="lk_img")
	private String lkImg;

	@Column(name="lk_inf")
	private String lkInf;

	@Column(name="lock_reg")
	private BigDecimal lockReg;

	private Long orden;

	private Long practica;

	private BigDecimal validado;

	
	public AudImagen() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArea() {
		return this.area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getEstadoD() {
		return this.estadoD;
	}

	public void setEstadoD(Integer estadoD) {
		this.estadoD = estadoD;
	}

	public Integer getEstadoU() {
		return this.estadoU;
	}

	public void setEstadoU(Integer estadoU) {
		this.estadoU = estadoU;
	}

	public Integer getEstadoinformes() {
		return this.estadoinformes;
	}

	public void setEstadoinformes(Integer estadoinformes) {
		this.estadoinformes = estadoinformes;
	}

	public Timestamp getFecIni() {
		return this.fecIni;
	}

	public void setFecIni(Timestamp fecIni) {
		this.fecIni = fecIni;
	}

	public Timestamp getFecUpd() {
		return this.fecUpd;
	}

	public void setFecUpd(Timestamp fecUpd) {
		this.fecUpd = fecUpd;
	}

	public String getFirstUser() {
		return this.firstUser;
	}

	public void setFirstUser(String firstUser) {
		this.firstUser = firstUser;
	}

	public Long getHistoria() {
		return this.historia;
	}

	public void setHistoria(Long historia) {
		this.historia = historia;
	}

	public String getLastUser() {
		return this.lastUser;
	}

	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}

	public String getLkImg() {
		return this.lkImg;
	}

	public void setLkImg(String lkImg) {
		this.lkImg = lkImg;
	}

	public String getLkInf() {
		return this.lkInf;
	}

	public void setLkInf(String lkInf) {
		this.lkInf = lkInf;
	}

	public BigDecimal getLockReg() {
		return this.lockReg;
	}

	public void setLockReg(BigDecimal lockReg) {
		this.lockReg = lockReg;
	}

	public Long getOrden() {
		return this.orden;
	}

	public void setOrden(Long orden) {
		this.orden = orden;
	}

	public Long getPractica() {
		return this.practica;
	}

	public void setPractica(Long practica) {
		this.practica = practica;
	}

	public BigDecimal getValidado() {
		return this.validado;
	}

	public void setValidado(BigDecimal validado) {
		this.validado = validado;
	}

}
