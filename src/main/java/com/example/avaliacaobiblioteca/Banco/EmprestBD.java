package com.example.avaliacaobiblioteca.Banco;

import com.example.avaliacaobiblioteca.Model.Cliente;
import com.example.avaliacaobiblioteca.Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestBD {

    public List<Emprestimo> emprestimos;

    public EmprestBD() {
        this.emprestimos = new ArrayList<>();
    }

    public List<Cliente> clientes;

    // 1. Busca por todos os empréstimos
    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimos);
    }

    // 2. Adiciona novos empréstimos
    public boolean insert(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        return true;
    }

    // 3. Adiciona um livro ao empréstimo

    public boolean insertLivro(Emprestimo emprestimo, String livrosEmprest){
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(eFiltro -> eFiltro.getIdEmprest().equals(emprestimo.getIdEmprest()))
                .findFirst()
                .orElse(null);

        if (emprestimoBD == null) {
            return  false;
        }

        emprestimo.getLivrosEmprest().add(livrosEmprest);
        return true;
    }

    // 4. Atualiza data final do empréstimo
    public boolean updateFinal(Long idEmprest, Emprestimo emprestimo) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(eFiltro -> eFiltro.getIdEmprest().equals(emprestimo.getIdEmprest()))
                .findFirst()
                .orElse(null);

        if (emprestimoBD == null) {
            return  false;
        }

        emprestimoBD.setDataEnd(emprestimo.getDataEnd());

        return true;
    }

    //5. Remove um empréstimo
    public boolean delete(Long idEmprest) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(eFiltro -> eFiltro.getIdEmprest() == idEmprest)
                .findFirst()
                .orElse(null);

        if (emprestimoBD == null) {
            return false;
        }
        emprestimos.remove(emprestimoBD);
        return true;
    }

    // 6. Buscar por data final de empréstimos

    public Emprestimo getByEnd(String dataEnd) {
        return emprestimos.stream()
                .filter(eFiltro -> eFiltro.getDataEnd() == dataEnd)
                .findFirst()
                .orElse(null);
    }

    // 7. Atualiza dados do cliente
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
