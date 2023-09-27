package ufrn.br.cliente;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class ClienteApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(ClienteApplication.class, args);

    }


}
