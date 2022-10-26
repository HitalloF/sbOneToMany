package br.com.onetomany.controller;


import br.com.onetomany.dto.PedidoResposta;
import br.com.onetomany.dto.SolicitacaoPedido;
import br.com.onetomany.entity.Cliente;
import br.com.onetomany.repository.ClienteRepository;
import br.com.onetomany.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    @PostMapping("/pedido")
    public Cliente pedido(@RequestBody SolicitacaoPedido pedido){
        return clienteRepository.save(pedido.getCliente());
    }


    @GetMapping("/pedidos")
    public List<Cliente> pedidos(){
        return clienteRepository.findAll();
    }


    @GetMapping("/pedidos/info")
    public List<PedidoResposta> getJoinInformation(){
        return clienteRepository.getJoinInformation();
    }

}
