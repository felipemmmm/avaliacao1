package com.example.avaliacaobiblioteca.Controller;

import com.example.avaliacaobiblioteca.Banco.EmprestBD;
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
}
