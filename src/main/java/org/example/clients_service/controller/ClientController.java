package org.example.clients_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.clients_service.entity.Client;
import org.example.clients_service.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<Client> findAllClients(){
        return  clientService.findAllClients();
    }
    @GetMapping("/{id}")
    public Client findClientById (@PathVariable Long id){
        return clientService.findClientById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

}
