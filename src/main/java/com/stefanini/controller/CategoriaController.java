package com.stefanini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Categoria;
import com.stefanini.service.CategoriaService;

@Path("/categoria")
@RequestScoped
public class CategoriaController {

	@Inject
	private CategoriaService categoriaService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> get() {

		List<Categoria> listaCategoria = new ArrayList<Categoria>();
		listaCategoria = categoriaService.listar();

		return listaCategoria;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(Categoria a) {

		categoriaService.incluir(a);

	}
}