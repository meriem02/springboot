package org.sid.entities;

import javax.persistence.*;

@Entity
public class DzmandeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nommateriel")
    private String nommateriel;
    @Column(name = "refmateriel")
    private String refmateriel;
    @Column(name = "quantite")
    private String quantite;
    @Column(name = "Date")
    private String Date;
    @Column(name = "disponibilite")
    private String disponibilite;

    public DzmandeStock(Long id, String nommateriel, String refmateriel, String quantite, String date, String disponibilite) {
        this.id = id;
        this.nommateriel = nommateriel;
        this.refmateriel = refmateriel;
        this.quantite = quantite;
        Date = date;
        this.disponibilite = disponibilite;
    }

    public DzmandeStock() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNommateriel() {
        return nommateriel;
    }

    public void setNommateriel(String nommateriel) {
        this.nommateriel = nommateriel;
    }

    public String getRefmateriel() {
        return refmateriel;
    }

    public void setRefmateriel(String refmateriel) {
        this.refmateriel = refmateriel;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }
}
