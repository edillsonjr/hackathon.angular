package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.model.Infracao;
import com.stefanini.model.LocalInfracao;
import com.stefanini.service.AgenteService;
import com.stefanini.service.InfracaoService;
import com.stefanini.service.LocalInfracaoService;

@Named("infracaoMB")
@SessionScoped
public class InfracaoBean implements Serializable {

	private static final long serialVersionUID = -8723983763688668353L;

	@Inject
	private InfracaoService infracaoService;
	
	@Inject
	private AgenteService agenteService;
	
	@Inject
	private LocalInfracaoService localInfacaoService;
	
	@Inject
	private Infracao infracao;
	
	private List<Infracao> infracoes;
	private List<Agente> agentes;
	private List<LocalInfracao> locaisInfracao;
	
	@PostConstruct
	public void inicia() {
		getInfracoes();
		getAgentes();
		getLocaisInfracao();
		
	}
	
	
	public List<Infracao> getInfracoes() {
		if (infracoes == null) {
			infracoes = new ArrayList<Infracao>();
			infracoes = infracaoService.listar();
		}
		return infracoes;
	}

	public void setInfracoes(List<Infracao> infracoes) {
		this.infracoes = infracoes;
	}

	public List<Agente> getAgentes() {
		if (agentes == null) {
			agentes = new ArrayList<Agente>();
			agentes = agenteService.listar();
		}
		return agentes;
	}



	public void setAgentes(List<Agente> agentes) {
		this.agentes = agentes;
	}



	public List<LocalInfracao> getLocaisInfracao() {
		if (locaisInfracao == null) {
			locaisInfracao = new ArrayList<LocalInfracao>();
			locaisInfracao = localInfacaoService.listar();
		}
		
		return locaisInfracao;
	}
	
	public Infracao getInfracao() {
		if (infracao == null) {
			infracao = new Infracao();
		}
		return infracao;
	}

	public void setInfracao(Infracao infracao) {
		this.infracao = infracao;
	}
	
	public void inserir() {
		infracaoService.incluir(infracao);
		infracao = new Infracao();
	}

	
	
	public List<Agente> completeAgente(String query) {
        List<Agente> results = new ArrayList<Agente>();
        for (Agente a : agentes) {
        	if (a.getNome().toUpperCase().contains(query.toUpperCase())){
        		results.add(a);
        	}
        }
         
        return results;
    }
	
	public List<LocalInfracao> completeLocalInfracao(String query) {
		List<LocalInfracao> results = new ArrayList<LocalInfracao>();
		for (LocalInfracao local : locaisInfracao) {
			if (local.getDescricaoLocalInfracao().toUpperCase().contains(query.toUpperCase())){
				results.add(local);
			}
		}
		return results;
	}
}
