package com.example.firstrocket.dto;

import com.example.firstrocket.services.validation.MentoradoInsert;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@MentoradoInsert
public class MentoradoNewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres!")
    private String nomeCompleto;

    @NotEmpty(message = "Preenchimento obrigatório!")
    private String cpf;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Email(message = "E-mail inválido!")
    private String email;

    @NotEmpty(message = "Preenchimento obrigatório!")
    private String senha;

    private Integer agendamentos;

    private String autorizado;

    public MentoradoNewDTO() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(Integer agendamentos) {
        this.agendamentos = agendamentos;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }
}
