package com.example.firstrocket.dto;

import java.io.Serializable;
import java.util.Date;

public class MentoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idMentor;
    private Integer idMentorado;
    private Date dataEHora;
    private String link;

    public MentoriaDTO() {
    }

    public Integer getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(Integer idMentor) {
        this.idMentor = idMentor;
    }

    public Integer getIdMentorado() {
        return idMentorado;
    }

    public void setIdMentorado(Integer idMentorado) {
        this.idMentorado = idMentorado;
    }

    public Date getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(Date dataEHora) {
        this.dataEHora = dataEHora;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
