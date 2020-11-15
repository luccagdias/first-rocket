package com.example.firstrocket.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Mentor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCompleto;
    private String sobre;
    private String email;
    private String cpf;
    private List<Date> horarios;

    public Mentor() {
    }

    public Mentor(Integer id, String nomeCompleto, String sobre, String email, String cpf, List<Date> horarios) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.sobre = sobre;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Date> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Date> horarios) {
        this.horarios = horarios;
    }
}
