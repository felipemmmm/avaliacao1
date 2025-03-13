package com.example.avaliacaobiblioteca.Model;

public class Cliente {
    Long idCliente;
    String nomeCliente;
    int cpf;
    int telefone;
    String email;

    Cliente(){}
    Cliente(Long idCliente, String nomeCliente, int cpf, int telefone, String email) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
