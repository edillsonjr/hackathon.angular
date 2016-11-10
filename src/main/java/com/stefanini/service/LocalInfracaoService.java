package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.LocalInfracao;
import com.stefanini.repository.LocalInfracaoRepository;

@Stateless
public class LocalInfracaoService {

	@Inject
    private LocalInfracaoRepository localInfracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(LocalInfracao localInfracao){
    	localInfracaoRepository.incluir(localInfracao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<LocalInfracao> listar() {
		return localInfracaoRepository.lista();
	}
	
}
