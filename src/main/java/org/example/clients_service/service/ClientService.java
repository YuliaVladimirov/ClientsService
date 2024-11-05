package org.example.clients_service.service;

import lombok.RequiredArgsConstructor;
import org.example.clients_service.entity.Client;
import org.example.clients_service.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

private final ClientRepository clientRepository;

public List<Client> findAllClients (){
    return clientRepository.findAll();
}

public Client findClientById(Long id){
    return clientRepository.findById(id).orElse(null);
}

public Client addClient(Client client){
    return clientRepository.save(client);
}
}
