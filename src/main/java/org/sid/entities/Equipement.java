package org.sid.entities;

import javax.persistence.*;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Refmateriel")
    private String refmateriel;
    @Column(name = "Materiel")
    private String materiel;
    @Column(name = "quantite")
    private Integer quantite;
    @Column(name = "distination")
    private String distination;
    @Column(name = "etat")
    private Boolean etat;
    @Column(name = "date")
    private String date;

    public Equipement(Long id, String refmateriel, String materiel, Integer quantite, String distination, Boolean etat, String date) {
        this.id = id;
        this.refmateriel = refmateriel;
        this.materiel = materiel;
        this.quantite = quantite;
        this.distination = distination;
        this.etat = etat;
        this.date = date;
    }

    public Equipement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefmateriel() {
        return refmateriel;
    }

    public void setRefmateriel(String refmateriel) {
        this.refmateriel = refmateriel;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getDistination() {
        return distination;
    }

    public void setDistination(String distination) {
        this.distination = distination;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
