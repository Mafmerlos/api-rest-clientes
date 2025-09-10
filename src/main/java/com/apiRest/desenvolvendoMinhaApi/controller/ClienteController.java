package com.apiRest.desenvolvendoMinhaApi.controller;

import com.apiRest.desenvolvendoMinhaApi.dto.ClienteDto;
import com.apiRest.desenvolvendoMinhaApi.model.Cliente;

import com.apiRest.desenvolvendoMinhaApi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping
    public List <ClienteDto> listar (){
    return clienteService.listarClientes();
   }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody ClienteDto clienteDto) {
        clienteService.adicionarCliente(clienteDto);
    }



}
