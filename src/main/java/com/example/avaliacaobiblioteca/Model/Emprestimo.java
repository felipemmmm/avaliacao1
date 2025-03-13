package com.example.avaliacaobiblioteca.Model;

import java.util.ArrayList;

public class Emprestimo {

    private Long idEmprest;
    private String  dataStart;
    private String dataEnd;
    private ArrayList<String> livrosEmprest = new ArrayList<String>();
    private String clienteEmprest;

    Emprestimo(){}
    Emprestimo(String dataStart, String dataEnd, ArrayList<String> livrosEmprest, String clienteEmprest, Long idEmprest) {
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

    public String getDataStart() {
        return dataStart;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
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
