package com.example.firstrocket.domain;

import java.io.Serializable;
import java.util.Date;

public class Mentoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer idMentor;
    private Integer idMentorado;
    private Date dataEHora;
    private String link;

    public Mentoria() {
    }

    public Mentoria(Integer id, Integer idMentor, Integer idMentorado, Date dataEHora, String link) {
        this.id = id;
        this.idMentor = idMentor;
        this.idMentorado = idMentorado;
        this.dataEHora = dataEHora;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
