package mory.kone.applibackend.service;

import mory.kone.applibackend.entites.Client;
import mory.kone.applibackend.repository.ClientRepository;
import org.springframework.stereotype.Service;


@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client){
        this.clientRepository.save(client);

    }

}
