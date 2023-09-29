package ufrn.br.cliente.controller;



import org.springframework.web.bind.annotation.*;
import ufrn.br.cliente.model.Cliente;
import ufrn.br.cliente.service.ClienteService;

@RestController
public class ClienteController {
    ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }


    @PostMapping("/")
    public String cadastrarCliente(@RequestBody Cliente cliente) {
        service.create(cliente);
        return "redirect:/index";
    }

    @DeleteMapping("/delete")
   public String delete(String cpf){
        service.delete(cpf);
        return "Cliente deletado com sucesso";
   }


}
