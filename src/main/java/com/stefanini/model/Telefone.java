package com.stefanini.model;
// Generated 07/11/2016 12:03:46 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefones", catalog = "hackathon")
public class Telefone implements java.io.Serializable {

	private static final long serialVersionUID = -3150757088627042126L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="telefoneId", unique=true, nullable=false)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "idTipoTelefone")
	private TipoTelefone tipoTelefone;
	
	@Column(name="numero", nullable = false, unique = true)
	private int numero;
	
	@Column(name="ddd")
	private int ddd;
	
	@ManyToOne
	@JoinColumn(name="idProprietario")
	private Proprietario proprietario;

	
	public Telefone(int id, TipoTelefone tipoTelefone, int numero, int ddd, Proprietario proprietario) {
		this.id = id;
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
		this.ddd = ddd;
		this.proprietario = proprietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Telefone() {
	}

	
}
