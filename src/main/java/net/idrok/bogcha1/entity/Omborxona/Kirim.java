
package net.idrok.bogcha1.entity.Omborxona;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="krim")
public class Kirim {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Mahsulot mahsulot;
    private LocalDate vaqt;
    private String info;
    
    public Kirim() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mahsulot getMahsulot() {
        return mahsulot;
    }

    public void setMahsulot(Mahsulot mahsulot) {
        this.mahsulot = mahsulot;
    }

    public LocalDate getVaqt() {
        return vaqt;
    }

    public void setVaqt(LocalDate vaqt) {
        this.vaqt = vaqt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    
}
