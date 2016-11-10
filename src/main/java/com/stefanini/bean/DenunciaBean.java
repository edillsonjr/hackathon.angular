package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Denuncia;
import com.stefanini.service.DenunciaService;

@Named( "denunciaMB")
public class DenunciaBean {

    @Inject
    private DenunciaService denunciaService;

    @Inject
    private Denuncia denuncia;

	public Denuncia getDenuncia() {
		if (denuncia == null) {
			denuncia = new Denuncia();
		}
		return denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}
    
    public void inserir() {
    	denunciaService.incluir(denuncia);
    	denuncia = new Denuncia();
    }

}
