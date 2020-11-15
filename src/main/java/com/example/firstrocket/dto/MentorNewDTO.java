package com.example.firstrocket.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MentorNewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres!")
    private String nomeCompleto;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Length(min = 5, max = 500, message = "O tamanho deve ser entre 5 e 120 caracteres!")
    private String sobre;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Email(message = "E-mail inválido!")
    private String email;

    @NotEmpty(message = "Preenchimento obrigatório!")
    private String cpf;

    private String horarios;

    public MentorNewDTO() {
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

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
