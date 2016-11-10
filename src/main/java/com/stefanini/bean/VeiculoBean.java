package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Veiculo;
import com.stefanini.service.VeiculoService;

@Named("veiculoMB")
@SessionScoped
public class VeiculoBean implements Serializable {

	private static final long serialVersionUID = 6093774401152249970L;

	@Inject
	private Veiculo veiculo;
	
	@Inject
	private VeiculoService veiculoService;
	
	public void inserir() {
		veiculoService.incluir(veiculo);
		veiculo = new Veiculo();
	}

	public Veiculo getVeiculo() {
		if (veiculo == null) {
			veiculo = new Veiculo();
		}
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	
}
