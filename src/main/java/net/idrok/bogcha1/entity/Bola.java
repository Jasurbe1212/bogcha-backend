package net.idrok.bogcha1.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bola")
public class Bola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, unique = true, nullable = false)
    private String ism;
    private String familya;
    private String sharif;
    private Date tugkun;
    private String ota;
    private String ona;
    private Date kelsana;
    private Date ketsana;
    private String telnomer;
    @ManyToOne
    private Guruh guruh;
    private String info;
    private Bolajins bolajins;
    
    public Bola() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIsm() {
        return ism;
    }
    public void setIsm(String ism) {
        this.ism = ism;
    }
    public String getFamilya() {
        return familya;
    }
    public void setFamilya(String familya) {
        this.familya = familya;
    }
    public String getSharif() {
        return sharif;
    }
    public void setSharif(String sharif) {
        this.sharif = sharif;
    }
    public Date getTugkun() {
        return tugkun;
    }
    public void setTugkun(Date tugkun) {
        this.tugkun = tugkun;
    }
    public String getOta() {
        return ota;
    }
    public void setOta(String ota) {
        this.ota = ota;
    }
    public String getOna() {
        return ona;
    }
    public void setOna(String ona) {
        this.ona = ona;
    }
    public Date getKelsana() {
        return kelsana;
    }
    public void setKelsana(Date kelsana) {
        this.kelsana = kelsana;
    }
    public Date getKetsana() {
        return ketsana;
    }
    public void setKetsana(Date ketsana) {
        this.ketsana = ketsana;
    }
    public String getTelnomer() {
        return telnomer;
    }
    public void setTelnomer(String telnomer) {
        this.telnomer = telnomer;
    }
    public Guruh getGuruh() {
        return guruh;
    }
    public void setGuruh(Guruh guruh) {
        this.guruh = guruh;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Bolajins getBolajins() {
        return bolajins;
    }
    public void setBolajins(Bolajins bolajins) {
        this.bolajins = bolajins;
    }

     
    
}
