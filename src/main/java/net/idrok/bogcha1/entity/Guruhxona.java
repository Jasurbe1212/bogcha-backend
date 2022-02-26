package net.idrok.bogcha1.entity;

import javax.persistence.Table;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name="guruhxona")
public class Guruhxona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Guruh guruh;
    @ManyToOne
    private Xona xona;

    private Date vaqt;
    private String info;

    public Guruhxona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guruh getGuruh() {
        return guruh;
    }

    public void setGuruh(Guruh guruh) {
        this.guruh = guruh;
    }

    public Xona getXona() {
        return xona;
    }

    public void setXona(Xona xona) {
        this.xona = xona;
    }

    public Date getVaqt() {
        return vaqt;
    }

    public void setVaqt(Date vaqt) {
        this.vaqt = vaqt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
 
    

}   
