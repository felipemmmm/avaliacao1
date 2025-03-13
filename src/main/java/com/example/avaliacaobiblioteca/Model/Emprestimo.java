package com.example.avaliacaobiblioteca.Model;

import java.util.ArrayList;

public class Emprestimo {

    private Long idEmprest;
    private int dataStart;
    private int dataEnd;
    private ArrayList<String> livrosEmprest = new ArrayList<String>();
    private String clienteEmprest;

    Emprestimo(){}
    Emprestimo(int dataStart, int dataEnd, ArrayList<String> livrosEmprest, String clienteEmprest, Long idEmprest) {
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.livrosEmprest = livrosEmprest;
        this.clienteEmprest = clienteEmprest;
        this.idEmprest = idEmprest;
    }

    public Long getIdEmprest() {
        return idEmprest;
    }

    public void setIdEmprest(Long idEmprest) {
        this.idEmprest = idEmprest;
    }

    public int getDataStart() {
        return dataStart;
    }

    public void setDataStart(int dataStart) {
        this.dataStart = dataStart;
    }

    public int getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(int dataEnd) {
        this.dataEnd = dataEnd;
    }

    public ArrayList<String> getLivrosEmprest() {
        return livrosEmprest;
    }

    public void setLivrosEmprest(ArrayList<String> livrosEmprest) {
        this.livrosEmprest = livrosEmprest;
    }

    public String getClienteEmprest() {
        return clienteEmprest;
    }

    public void setClienteEmprest(String clienteEmprest) {
        this.clienteEmprest = clienteEmprest;
    }


}
