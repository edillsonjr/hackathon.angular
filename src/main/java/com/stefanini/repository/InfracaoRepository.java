package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Infracao;

public class InfracaoRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(Infracao infracao) {
		this.manager.persist(infracao);
	}

	public void altera(Infracao infracao) {
		this.manager.merge(infracao);
	}

	public Infracao busca(Integer id) {
		return this.manager.find(Infracao.class, id);
	}

	public List<Infracao> lista() {
		return this.manager.createQuery("select c from Infracao c", Infracao.class)
				.getResultList();
	}
	
}
