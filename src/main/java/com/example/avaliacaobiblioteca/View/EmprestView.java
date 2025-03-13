package com.example.avaliacaobiblioteca.View;

import com.example.avaliacaobiblioteca.Controller.EmprestController;
import com.example.avaliacaobiblioteca.Model.Cliente;
import com.example.avaliacaobiblioteca.Model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestView {

    EmprestController emprestController = new EmprestController();

    // 1. Buscar empréstimos
    @GetMapping
    public List<Emprestimo> getAll(
        @RequestParam(required = false)Long idEmprest
    ) {
            return emprestController.getAll();
    }


    // 2. Adicionar novos empréstimos
    @PostMapping
    public boolean addEmprest(@RequestBody Emprestimo emprestimo) {
        return emprestController.addEmprest(emprestimo);
    }

    // 3. Adicionar um livro ao empréstimo
    @PostMapping("/{emprestimo}/livrosEmprest")
    public  boolean insertLivro(@PathVariable Emprestimo emprestimo, @RequestBody String livrosEmprest) {
        return emprestController.insertLivro(emprestimo, livrosEmprest);
    }

    // 4. Atualizar data final do empréstimo
    @PutMapping("/{idEmprest}")
    public Emprestimo updateEnd(@PathVariable Long idEmprest, @RequestBody Emprestimo emprestimo) {
        return emprestController.updateEnd(idEmprest, emprestimo);
    }

    // 5. Remover um empréstimo
    @DeleteMapping("/{idEmprest}")
    public boolean delete(@PathVariable Long idEmprest) {
        return emprestController.delete(idEmprest);
    }

    // 6. Buscar por data final do empréstimo
    @GetMapping("/{dataEnd}")
    public Emprestimo getByEnd(@PathVariable String dataEnd) {
        return emprestController.getByEnd(dataEnd);
    }

    // 7. Atualizar dados de um cliente
    @PutMapping("/{idCliente}")
    public Cliente updateCliente(@PathVariable Long idCliente, @RequestBody Cliente cliente) {
        return emprestController.updateCliente(idCliente, cliente);
    }
}
