package br.com.onetomany.repository;

import br.com.onetomany.dto.PedidoResposta;
import br.com.onetomany.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT new br.com.onetomany.dto.PedidoResposta(c.name , p.produtoNome) FROM Cliente c JOIN c.produtos p")
    public List<PedidoResposta> getJoinInformation();

}
