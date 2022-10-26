package br.com.onetomany.dto;

import br.com.onetomany.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SolicitacaoPedido {

    private Cliente cliente;
}
