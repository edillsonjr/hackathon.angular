package com.stefanini.model;
// Generated 07/11/2016 12:03:46 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "infracoes", catalog = "hackathon")
public class Infracao implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 221337687967481848L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idInfracao", unique = true, nullable = false)
	private Integer idInfracao;
	
	@OneToOne
	@JoinColumn(name="cpfAgente")
	private Agente agente;
	
	@OneToOne
	@JoinColumn(name="idLocalInfracao")
	private LocalInfracao localInfracao;
	
	@OneToOne
	@JoinColumn(name="idTipoInfracao")
	private TipoInfracao tipoInfracao;
	
	@OneToOne
	@JoinColumn(name="placa")
	private Veiculo veiculo;
	
	@Column(name = "velocidade")
	private Integer velocidade;

	public Infracao() {
		
	}
	
	public Infracao(Integer idInfracao, Agente agente, LocalInfracao localInfracao, TipoInfracao tipoInfracao,
			Veiculo veiculo, Integer velocidade) {
		this.idInfracao = idInfracao;
		this.agente = agente;
		this.localInfracao = localInfracao;
		this.tipoInfracao = tipoInfracao;
		this.veiculo = veiculo;
		this.velocidade = velocidade;
	}
	
	public Integer getIdInfracao() {
		return idInfracao;
	}

	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public LocalInfracao getLocalInfracao() {
		return localInfracao;
	}

	public void setLocalInfracao(LocalInfracao localInfracao) {
		this.localInfracao = localInfracao;
	}

	public TipoInfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(TipoInfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

}
