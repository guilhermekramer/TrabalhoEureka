package ufrn.br.cliente.service;


import org.springframework.stereotype.Service;
import ufrn.br.cliente.model.Cliente;
import ufrn.br.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

   ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente create(Cliente cliente){
        return repository.save(cliente);
    }

    public void delete(String cpf){
        repository.deleteByCpf(cpf);
    }


}
