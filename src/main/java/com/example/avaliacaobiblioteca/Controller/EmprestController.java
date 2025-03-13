package com.example.avaliacaobiblioteca.Controller;

import com.example.avaliacaobiblioteca.Banco.EmprestBD;
import com.example.avaliacaobiblioteca.Model.Cliente;
import com.example.avaliacaobiblioteca.Model.Emprestimo;

import java.util.List;

public class EmprestController {

    EmprestBD bancoD = new EmprestBD();

    // 1. Buscar todos os empréstimos
    public List<Emprestimo> getAll() {
        return bancoD.findAll();
    }

    // 2. Adiciona novos empréstimos
    public boolean addEmprest(Emprestimo emprestimo) {
        return bancoD.insert(emprestimo);
    }

    // 3. Adiciona um livro ao empréstimo
    public boolean insertLivro(Emprestimo emprestimo, String livrosEmprest){
        return bancoD.insertLivro(emprestimo, livrosEmprest);
    }

    // 4. Atualiza data final do empréstimo
    public Emprestimo updateEnd(Long idEmprest, Emprestimo emprestimo) {
        boolean result = bancoD.updateFinal(idEmprest, emprestimo);

        if (result) {
            return  emprestimo;
        }
        return null;
    }

    // 5. Remove um empréstimo
    public boolean delete(Long idEmprest) {
        return bancoD.delete(idEmprest);
    }

    // 6. Buscar por data final de empréstimos
    public Emprestimo getByEnd(String dataEnd) {
        return bancoD.getByEnd(dataEnd);
    }

    // 7. Atualiza dados de um cliente
    public Cliente updateCliente(Long idCliente, Cliente cliente) {
        boolean result = bancoD.updateCliente(idCliente, cliente);

        if(result) {
            return cliente;
        }

        return null;
    }

}
