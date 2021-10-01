package org.sid.entities;

import javax.persistence.*;

@Entity
public class DemandeAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "admin")
    private String admin;
    @Column(name = "nontraiter")
    private String nontraiter;
    @Column(name = "iddemande")
    private String iddemande;
    @Column(name = "Date")
    private String Dat;
    @Column(name = "isAccepted")
    private boolean isAccepted;
    @Column(name = "direction")
    private String direction;
    @Column(name = "Reclamaation")
    private String rec;
    @Column(name = "isRepareted")
    private boolean isReparated;

    public DemandeAdmin(Long id, String admin, String nontraiter, String iddemande, String dat, boolean isAccepted, String direction, String rec, boolean isReparated) {
        this.id = id;
        this.admin = admin;
        this.nontraiter = nontraiter;
        this.iddemande = iddemande;
        Dat = dat;
        this.isAccepted = isAccepted;
        this.direction = direction;
        this.rec = rec;
        this.isReparated = isReparated;
    }

    public DemandeAdmin() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getNontraiter() {
        return nontraiter;
    }

    public void setNontraiter(String nontraiter) {
        this.nontraiter = nontraiter;
    }

    public String getIddemande() {
        return iddemande;
    }

    public void setIddemande(String iddemande) {
        this.iddemande = iddemande;
    }

    public String getDat() {
        return Dat;
    }

    public void setDat(String dat) {
        Dat = dat;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public boolean isReparated() {
        return isReparated;
    }

    public void setReparated(boolean reparated) {
        isReparated = reparated;
    }
}
