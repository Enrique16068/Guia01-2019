/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.entity;

import java.time.LocalDate;
import javax.ejb.Stateless;


/**
 *
 * @author estuardo
 */
@Stateless
public class Pelicula {
   private int idPelicula;
   private String titulo;
   private String duracion;
   private String director;
   private String genero;
   private LocalDate fechaEstreno;
   private String sinopsis;
   private char clasificacion;
   
    public Pelicula(){
        
    }
   
    public Pelicula(int idPelicula, String titulo, String duracion, String director, String genero, LocalDate fechaEstreno, char clasificacion,String sinopsis) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.genero = genero;
        this.fechaEstreno = fechaEstreno;
        this.clasificacion = clasificacion;
         this.sinopsis = sinopsis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public char getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }
   
   
    
    
    
}
