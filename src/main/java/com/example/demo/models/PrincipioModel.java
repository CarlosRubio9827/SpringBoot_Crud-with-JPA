package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "principio")
public class PrincipioModel {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mision;
    private String vision;
    private String sobreNosotros;
    private String quieresVender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getSobreNosotros() {
        return sobreNosotros;
    }

    public void setSobreNosotros(String sobreNosotros) {
        this.sobreNosotros = sobreNosotros;
    }

    public String getQuieresVender() {
        return quieresVender;
    }

    public void setQuieresVender(String quieresVender) {
        this.quieresVender = quieresVender;
    }
}
