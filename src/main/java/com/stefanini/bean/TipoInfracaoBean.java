package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.TipoInfracao;
import com.stefanini.service.TipoInfracaoService;

@Named("tipoInfracaoMB")
@SessionScoped
public class TipoInfracaoBean implements Serializable {

	private static final long serialVersionUID = 1462175658675012484L;

	@Inject
	private TipoInfracaoService tipoInfracaoService;
	
	@Inject
	private TipoInfracao tipoInfracao;
	
	private List<TipoInfracao> tipos;

	public TipoInfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(TipoInfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	
	public void inserir() {
		tipoInfracaoService.incluir(tipoInfracao);
		tipos.add(tipoInfracao);
		tipoInfracao = new TipoInfracao();
	}

	public List<TipoInfracao> getTipos() {
		if (tipos == null) {
			tipos = new ArrayList<TipoInfracao>();
			tipos = tipoInfracaoService.listar();
		}
		return tipos;
	}

	public void setTipos(List<TipoInfracao> tipos) {
		this.tipos = tipos;
	}
	
}
