package com.apiRest.desenvolvendoMinhaApi.dto;

import com.apiRest.desenvolvendoMinhaApi.model.Cliente;

public record ClienteDto(Long id, String nome, String email) {

    public ClienteDto(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEmail());
    }
}
