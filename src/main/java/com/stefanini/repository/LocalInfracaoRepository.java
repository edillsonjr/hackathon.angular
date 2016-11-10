package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.LocalInfracao;

public class LocalInfracaoRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(LocalInfracao localInfracao) {
		this.manager.persist(localInfracao);
	}

	public void altera(LocalInfracao localInfracao) {
		this.manager.merge(localInfracao);
	}

	public LocalInfracao busca(Integer id) {
		return this.manager.find(LocalInfracao.class, id);
	}

	public List<LocalInfracao> lista() {
		return this.manager.createQuery("select c from LocalInfracao c", LocalInfracao.class)
				.getResultList();
	}
	
}
