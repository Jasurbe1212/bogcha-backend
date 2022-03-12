package net.idrok.bogcha1.entity.Omborxona;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mahsulot")
public class Mahsulot {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Mahsulottur mahsulottur;

    private String nom;
    private Long miqdor;
    private Long narx;
    @ManyToOne
    private Yetkazuvchi yetkazuvchi;
    private LocalDate vaqt;
    private String info;

    public Mahsulot() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mahsulottur getMahsulottur() {
        return mahsulottur;
    }

    public void setMahsulottur(Mahsulottur mahsulottur) {
        this.mahsulottur = mahsulottur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getMiqdor() {
        return miqdor;
    }

    public void setMiqdor(Long miqdor) {
        this.miqdor = miqdor;
    }

    public Long getNarx() {
        return narx;
    }

    public void setNarx(Long narx) {
        this.narx = narx;
    }

    public Yetkazuvchi getYetkazuvchi() {
        return yetkazuvchi;
    }

    public void setYetkazuvchi(Yetkazuvchi yetkazuvchi) {
        this.yetkazuvchi = yetkazuvchi;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LocalDate getVaqt() {
        return vaqt;
    }

    public void setVaqt(LocalDate vaqt) {
        this.vaqt = vaqt;
    }

    

    

}
