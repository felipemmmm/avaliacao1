package com.example.avaliacaobiblioteca.Banco;

import com.example.avaliacaobiblioteca.Model.Cliente;
import com.example.avaliacaobiblioteca.Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class ClientBD {

    public List<Cliente> clientes;

    public ClientBD() {
        this.clientes = new ArrayList<>();
    }

    // 1. Atualiza dados do cliente
    public boolean updateCliente(Long idCliente, Cliente cliente) {
        Cliente clienteBD = clientes.stream()
                .filter(cFiltro -> cFiltro.getIdCliente().equals(cliente.getIdCliente()))
                .findFirst()
                .orElse(null);

        if (clienteBD == null) {
            return  false;
        }

        clienteBD.setNomeCliente(cliente.getNomeCliente());
        clienteBD.setCpf(cliente.getCpf());
        cliente.setEmail(cliente.getEmail());
        cliente.setTelefone(cliente.getTelefone());

        return  true;
    }

}
