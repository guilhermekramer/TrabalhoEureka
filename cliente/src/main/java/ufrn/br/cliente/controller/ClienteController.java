package ufrn.br.cliente.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.cliente.model.Cliente;
import ufrn.br.cliente.service.ClienteService;

@RestController
public class ClienteController {
    ClienteService service;


    @PostMapping("/index")
   public String cadastrarCliente(Cliente cliente){
       service.create(cliente);
       return "cadastrarCliente";
   }

   @DeleteMapping("/delete")
   public String delete(String cpf){
        service.delete(cpf);
        return "Cliente deletado com sucesso";
   }


}
