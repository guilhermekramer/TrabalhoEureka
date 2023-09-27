package ufrn.br.vendas.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.vendas.model.Vendas;
import ufrn.br.vendas.service.VendasService;

@RestController
public class VendasController {

    VendasService service;

    @PostMapping("/venda")
    public String realizarVenda(@RequestBody Vendas vendas) {

        String cpf = vendas.getCpf();

        service.create(vendas);
        return "Venda realizada para o CPF: " + cpf;
    }



}
