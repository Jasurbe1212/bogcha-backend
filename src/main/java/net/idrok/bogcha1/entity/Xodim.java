package net.idrok.bogcha1.entity;

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
    private String Ism;
    private String Familya;
    private String Sharif;
    private String tugkun;
    private String kelsana;
    private String ketsana;
    private String telnomer;


    @ManyToOne
    private Lavozim lavozim;
    private String info;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIsm() {
        return Ism;
    }
    public void setIsm(String ism) {
        Ism = ism;
    }
    public String getFamilya() {
        return Familya;
    }
    public void setFamilya(String familya) {
        Familya = familya;
    }
    public String getSharif() {
        return Sharif;
    }
    public void setSharif(String sharif) {
        Sharif = sharif;
    }
    public String getTugkun() {
        return tugkun;
    }
    public void setTugkun(String tugkun) {
        this.tugkun = tugkun;
    }
    public String getKelsana() {
        return kelsana;
    }
    public void setKelsana(String kelsana) {
        this.kelsana = kelsana;
    }
    public String getKetsana() {
        return ketsana;
    }
    public void setKetsana(String ketsana) {
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
