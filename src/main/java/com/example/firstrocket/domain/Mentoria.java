package com.example.firstrocket.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Mentoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idMentor;
    private Integer idMentorado;
    private String dataEHora;
    private String link;

    public Mentoria() {
    }

    public Mentoria(Integer id, Integer idMentor, Integer idMentorado, String dataEHora, String link) {
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

    public String getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(String dataEHora) {
        this.dataEHora = dataEHora;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
