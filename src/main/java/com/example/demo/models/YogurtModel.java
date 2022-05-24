package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "yogurt")
public class YogurtModel {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yogurtId;
    @Column(name = "sabor_yogurt")
    private String saborYogurt;
    @Column(name = "descripcion_yogurt")
    private String descripcionYogurt;
    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "categoria_id", referencedColumnName = "Categoriaid")
    @JoinColumn(name = "categoria_id")
//    @JsonIgnoreProperties("yogurtModelList")
    private CategoriaModel categoria;

    public Long getYogurtId() {
        return yogurtId;
    }

    public void setYogurtId(Long yogurtId) {
        this.yogurtId = yogurtId;
    }

    public String getSaborYogurt() {
        return saborYogurt;
    }

    public void setSaborYogurt(String saborYogurt) {
        this.saborYogurt = saborYogurt;
    }

    public String getDescripcionYogurt() {
        return descripcionYogurt;
    }

    public void setDescripcionYogurt(String descripcionYogurt) {
        this.descripcionYogurt = descripcionYogurt;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }
}
