package org.sid.entities;

import javax.persistence.*;

@Entity

public class DemandeRep {
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
    @Column(name = "crepine")
    private String crepine;
    @Column(name = "Reclamaation")
    private String reclamation;
    @Column(name = "Etat")
    private Boolean etat;
    public DemandeRep() {

    }

    public String getDate() {
        return Date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public DemandeRep(Long id, String direction, String materiel, String date, String crépine, String reclamation,Boolean etat) {
        this.id = id;
        this.direction = direction;
        this.materiel = materiel;
        Date = date;
        this.crepine = crepine;
        this.reclamation = reclamation;
        this.etat=etat;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getcrepine() {
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
}
