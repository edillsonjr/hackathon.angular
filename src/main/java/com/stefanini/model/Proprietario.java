package com.stefanini.model;
// Generated 07/11/2016 12:03:46 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proprietario generated by hbm2java
 */
@Entity
@Table(name = "proprietario", catalog = "hackathon")
public class Proprietario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 73289892699851075L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer idProprietario;
	
	@Column(name = "cpfProprietario", unique = true, nullable = false)
	private Integer cpfProprietario;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "endereco", length = 100)
	private String endereco;
	
	@Column(name = "bairro", length = 100)
	private String bairro;
	
	@Column(name = "cidade", length = 100)
	private String cidade;
	
	@Column(name = "uf", length = 2)
	private String uf;
	
	@Column(name = "sexo", length = 1)
	private String sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dtNascimento", length = 10)
	private Date dtNascimento;
	
	@OneToMany
	@JoinColumn(name="telefoneId")
	private Collection<Telefone> telefones;

	public Proprietario() {
	}

	public Proprietario(String nome, String endereco, String bairro, String cidade, String uf, String sexo,
			Date dtNascimento, Collection<Telefone> telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		this.telefones = telefones;
	}

	
	public Integer getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}

	public Integer getCpfProprietario() {
		return this.cpfProprietario;
	}

	public void setCpfProprietario(Integer cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Collection<Telefone> getTelefone() {
		return telefones;
	}

	public void setTelefone(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}
	
}
