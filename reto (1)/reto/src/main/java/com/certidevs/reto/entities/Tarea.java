package com.certidevs.reto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private boolean completada;
    @ManyToOne
    @JoinColumn(name = "id_proyecto")
    private Proyecto proyecto;
    public Tarea(){

    }

    public Tarea(boolean completada, Proyecto proyecto, String descripcion, String titulo) {
        this.completada = completada;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                ", proyecto=" + proyecto +
                '}';
    }
}
