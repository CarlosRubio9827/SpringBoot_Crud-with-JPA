package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categoria")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long categoriaId;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @Column(name = "descripcion_categoria")
    private String descripcionCategoria;
/*
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    private List<YogurtModel> yogurtModelList = new ArrayList<>();
*/

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

   /* public List<YogurtModel> getYogurtModelList() {
        return yogurtModelList;
    }

    public void setYogurtModelList(List<YogurtModel> yogurtModelList) {
        this.yogurtModelList = yogurtModelList;
    }*/
}
