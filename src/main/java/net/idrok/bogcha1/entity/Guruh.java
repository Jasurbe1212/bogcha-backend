package net.idrok.bogcha1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="guruh")
public class Guruh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true,nullable = false)
    private String nom;
    @ManyToOne
    private Xodim xodim;
    private LocalDate ocsana;
    private LocalDate yopsana;
    private String info;

    public Guruh() {
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

    public Xodim getXodim() {
        return xodim;
    }

    public void setXodim(Xodim xodim) {
        this.xodim = xodim;
    }

    

    public LocalDate getOcsana() {
        return ocsana;
    }

    public void setOcsana(LocalDate ocsana) {
        this.ocsana = ocsana;
    }

    public LocalDate getYopsana() {
        return yopsana;
    }

    public void setYopsana(LocalDate yopsana) {
        this.yopsana = yopsana;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    

    

    
}
