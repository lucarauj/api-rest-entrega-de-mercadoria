package com.log.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.log.domain.model.Entrega;
import com.log.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
	
	BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public Ocorrencia registrar(Long id, String descricao) {
		
		Entrega entrega = buscaEntregaService.buscar(id);
		return entrega.adicionarOcorrencia(descricao);
	}
	

}
