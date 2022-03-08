package net.idrok.bogcha1.service.dto;
import net.idrok.bogcha1.entity.Omborxona.Mahsulottur;

public class MahsulotDto {
    
  
    private Long id;
    
   
    private Mahsulottur mahsulottur;

    private String nom;
    private Long miqdor;
  
    private String info;

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

  
    

    

}
