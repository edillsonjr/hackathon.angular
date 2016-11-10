package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;

public class AgenteRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(Agente agente) {
		System.out.println("Repository");
		this.manager.persist(agente);
	}
	
	public void alterar(Agente agente) {
		this.manager.merge(agente);
	}
	
	public Agente buscar(Integer id) {
		return this.manager.find(Agente.class, id);
	}
	
	public List<Agente> lista() {
		return this.manager.createQuery("select a from Agente a", Agente.class).getResultList();
	}
	
}
