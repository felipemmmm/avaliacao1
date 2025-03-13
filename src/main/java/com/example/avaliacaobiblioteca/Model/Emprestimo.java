package com.example.avaliacaobiblioteca.Model;

public class Emprestimo {

    int dataStart;
    int dataEnd;
    String livroEmprest;
    String clienteEmprest;

    Emprestimo(){}
    Emprestimo(int dataStart, int dataEnd, String livroEmprest, String clienteEmprest) {
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.livroEmprest = livroEmprest;
        this.clienteEmprest = clienteEmprest;
    }

}
