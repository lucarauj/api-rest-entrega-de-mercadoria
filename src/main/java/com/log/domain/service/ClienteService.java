package com.log.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.log.domain.exception.DomainException;
import com.log.domain.model.Cliente;
import com.log.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new DomainException("Cliente não encontrado"));
		
	}
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		boolean emailPresent = clienteRepository.findByEmail(cliente.getEmail()).stream().anyMatch(c -> !c.equals(cliente));
		
		if (emailPresent) {
			throw new DomainException("Já existe um cliente cadastrado com esse e-mail");
		}
		
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public void excluir(Long id) {
		clienteRepository.deleteById(id);
	}

}
