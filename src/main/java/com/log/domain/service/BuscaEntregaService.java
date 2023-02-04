package com.log.domain.service;

import org.springframework.stereotype.Service;

import com.log.domain.exception.EntidadeNaoEncontradaException;
import com.log.domain.model.Entrega;
import com.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long id) {

		return entregaRepository.findById(id).orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
		
	}
	
	

}
