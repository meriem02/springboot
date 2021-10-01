package org.sid.entities;

import javax.persistence.*;

@Entity
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Direction")
    private String direction;
    @Column(name = "Materiel")
    private String materiel;
    @Column(name = "Date")
    private String Date;

    public Historique() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCrepine() {
        return crepine;
    }

    public void setCrepine(String crepine) {
        this.crepine = crepine;
    }

    public String getReclamation() {
        return reclamation;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }




    @Column(name = "crepine")
    private String crepine;

    public Historique(Long id, String nom, String direction, String materiel, String date, String crepine, String reclamation) {
        this.id = id;
        this.nom = nom;
        this.direction = direction;
        this.materiel = materiel;
        Date = date;
        this.crepine = crepine;
        this.reclamation = reclamation;
    }

    @Column(name = "Reclamaation")
    private String reclamation;
}
