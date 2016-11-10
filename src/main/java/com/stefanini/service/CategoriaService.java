package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Categoria;
import com.stefanini.repository.CategoriaRepository;

@Stateless
public class CategoriaService {

	@Inject
	private CategoriaRepository categoriaRepository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Categoria categoria) {
		if (categoria.getIdCategoria() == null) {
			categoriaRepository.incluir(categoria);
		} else {
			categoriaRepository.alterar(categoria);
		}
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Categoria> listar() {
		return categoriaRepository.lista();
	}

}
