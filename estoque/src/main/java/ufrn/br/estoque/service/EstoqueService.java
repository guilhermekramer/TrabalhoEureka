package ufrn.br.estoque.service;

import org.springframework.stereotype.Service;
import ufrn.br.estoque.model.Estoque;
import ufrn.br.estoque.repository.EstoqueRepository;

@Service
public class EstoqueService {

    EstoqueRepository repository;


    public EstoqueService(EstoqueRepository repository){
        this.repository = repository;

    }

    public Estoque create(Estoque estoque){
        return repository.save(estoque);
    }

//    public void delete(Integer CodigoBarra ){
//        repository.deleteByCodigoBarra(CodigoBarra);
//    }




}
