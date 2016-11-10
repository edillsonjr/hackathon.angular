package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Denunciante;

public class DenuncianteRepository {
	
	@Inject
	private EntityManager manager;

	public void incluir(Denunciante denunciante) {
		this.manager.persist(denunciante);
	}

	public void alterar(Denunciante denunciante) {
		this.manager.merge(denunciante);
	}

	public Denunciante buscar(Integer id) {
		return this.manager.find(Denunciante.class, id);
	}

	public List<Denunciante> lista() {
		return this.manager.createQuery("select a from Denunciante a", Denunciante.class).getResultList();
	}

}
