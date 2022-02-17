package net.idrok.bogcha1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Xona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true, nullable = false)

    private String nom;

    @ManyToOne
    private Bino bino;

    private String qavat;

    @ManyToOne
    private Xonatur xonatur;

    private String info;

    

    public Xona() {
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

    public Bino getBino() {
        return bino;
    }

    public void setBino(Bino bino) {
        this.bino = bino;
    }

    public String getQavat() {
        return qavat;
    }

    public void setQavat(String qavat) {
        this.qavat = qavat;
    }

    public Xonatur getXonatur() {
        return xonatur;
    }

    public void setXonatur(Xonatur xonatur) {
        this.xonatur = xonatur;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
