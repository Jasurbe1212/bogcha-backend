package net.idrok.bogcha1.entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tolov")
public class Tolov {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String miqdor;
    @ManyToOne
    private Tolovtur tolovtur;
    private Date sana;
    @ManyToOne
    private Bola bola;
    private String info;

    public Tolov() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMiqdor() {
        return miqdor;
    }
    public void setMiqdor(String miqdor) {
        this.miqdor = miqdor;
    }
    public Tolovtur getTolovtur() {
        return tolovtur;
    }
    public void setTolovtur(Tolovtur tolovtur) {
        this.tolovtur = tolovtur;
    }
    public Date getSana() {
        return sana;
    }
    public void setSana(Date sana) {
        this.sana = sana;
    }
    public Bola getBola() {
        return bola;
    }
    public void setBola(Bola bola) {
        this.bola = bola;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    

}
