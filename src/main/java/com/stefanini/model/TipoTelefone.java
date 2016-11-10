package com.stefanini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipotelefone", catalog = "hackathon")
public class TipoTelefone implements java.io.Serializable {

	private static final long serialVersionUID = -5939796901016016378L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTipoTelefone", unique = true, nullable = false)
	private Integer idTipoTelefone;
	
	@Column(name = "descricaoTipoTelefone", length = 20)
	private String descricaoTipoTelefone;

	public TipoTelefone() {
	}

	public TipoTelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}

	
	public Integer getIdTipoTelefone() {
		return this.idTipoTelefone;
	}

	public void setIdTipoTelefone(Integer idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public String getDescricaoTipoTelefone() {
		return this.descricaoTipoTelefone;
	}

	public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}

}
