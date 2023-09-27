package ufrn.br.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.vendas.model.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {
}
