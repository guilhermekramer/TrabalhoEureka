package ufrn.br.estoque.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.estoque.model.Estoque;
import ufrn.br.estoque.service.EstoqueService;

@RestController
public class EstoqueController {
    EstoqueService service;

    public EstoqueController(EstoqueService service) {
        this.service = service;
    }

    @PostMapping("/")
    public String cadastrarEstoque(Estoque estoque){
        service.create(estoque);
        return "estoque criado com sucesso";
    }


    @GetMapping("/")
    public String index(){
        return "hello world";
    }

//    @DeleteMapping("/delete")
//    public String delete(Integer CodigoBarra){
//        service.delete(CodigoBarra);
//        return "Estoque deletado com sucesso";
//    }
}
