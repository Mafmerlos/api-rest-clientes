package com.apiRest.desenvolvendoMinhaApi.service;

import com.apiRest.desenvolvendoMinhaApi.dto.ClienteDto;
import com.apiRest.desenvolvendoMinhaApi.model.Cliente;
import com.apiRest.desenvolvendoMinhaApi.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDto> listarClientes() {
       List<Cliente> clientes = clienteRepository.findAll();
       return clientes.stream().map(ClienteDto::new).toList();
    }

    public ClienteDto adicionarCliente(ClienteDto clienteDto) {
        var cliente = new Cliente();
        cliente.setNome(clienteDto.nome());
        cliente.setEmail(clienteDto.email());
        clienteRepository.save(cliente);
        return new ClienteDto(cliente);
    }
}
