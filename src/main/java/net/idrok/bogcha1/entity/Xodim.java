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
@Table(name="xodim")
public class Xodim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true,nullable = false)
    private String ism;
    private String familya;
    private String Sharif;
    private Date tugkun;
    private Date kelsana;
    private Date ketsana;
    private String telnomer;


    @ManyToOne
    private Lavozim lavozim;
    private String info;

    

    
    public Xodim() {
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
        return Sharif;
    }
    public void setSharif(String sharif) {
        Sharif = sharif;
    }
    public Date getTugkun() {
        return tugkun;
    }
    public void setTugkun(Date tugkun) {
        this.tugkun = tugkun;
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
    public Lavozim getLavozim() {
        return lavozim;
    }
    public void setLavozim(Lavozim lavozim) {
        this.lavozim = lavozim;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    
   
  
    
}
