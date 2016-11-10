package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.LocalInfracao;
import com.stefanini.service.LocalInfracaoService;

@Named("localInfracaoMB")
@SessionScoped
public class LocalInfracaoBean implements Serializable {

	private static final long serialVersionUID = 3635965215843814903L;

	@Inject
	private LocalInfracaoService localInfracaoService;
	
	@Inject
	private LocalInfracao localInfracao;
	
	private List<LocalInfracao> locais;

	public LocalInfracao getLocalInfracao() {
		if (localInfracao == null) {
			localInfracao = new LocalInfracao();
		}
		return localInfracao;
	}

	public void setLocalInfracao(LocalInfracao localInfracao) {
		this.localInfracao = localInfracao;
	}
	
	public void inserir() {
		localInfracaoService.incluir(localInfracao);
		locais.add(localInfracao);
		localInfracao = new LocalInfracao();
	}

	public List<LocalInfracao> getLocais() {
		if (locais == null) {
			locais = new ArrayList<LocalInfracao>();
			locais = localInfracaoService.listar();
		}
		return locais;
	}

	public void setLocaisInfracao(List<LocalInfracao> locais) {
		this.locais = locais;
	}
	
	
}
