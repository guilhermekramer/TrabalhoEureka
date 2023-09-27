package ufrn.br.vendas.service;

import org.springframework.stereotype.Service;
import ufrn.br.vendas.model.Vendas;
import ufrn.br.vendas.repository.VendasRepository;

@Service
public class VendasService {

    VendasRepository repository;

    public Vendas create(Vendas vendas){
        return repository.save(vendas);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
