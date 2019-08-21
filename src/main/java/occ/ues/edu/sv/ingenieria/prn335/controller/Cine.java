/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import occ.ues.edu.sv.ingenieria.prn335.entity.Pelicula;

/**
 *
 * @author enrique
 */
public class Cine {

    /*Se les proporciona un arraylist de objetos Peliculas ya cargado en donde
    se deberan realizar las acciones*/
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    Pelicula modificacion;
   public Cine() {
        listaPeliculas.add(new Pelicula(1, "Blade Runner 2049", "163 minutos", "Dennis Villeneuve", "Ciencia Ficcion", LocalDate.of(2017, 10, 3), 'C', "Un androide tiene una crisis existencial"));
        listaPeliculas.add(new Pelicula(2, "A Quiet Place", "91 minutos", "John Krasinski", "Horror", LocalDate.of(2018, 3, 9), 'D', "Da miedo"));
        listaPeliculas.add(new Pelicula(3, "The Incredibles II", "120 minutos", "Brad Bird", "Acción", LocalDate.of(2016, 6, 15), 'A', "Un esposo celoso del exito de us esposa"));
        listaPeliculas.add(new Pelicula(4, "Avengers: Infinity War", "149 minutos", "Hermanos Russo", "Acción", LocalDate.of(2018, 4, 23), 'B', "Thanos encuentra el one pice"));
        listaPeliculas.add(new Pelicula(5, "Dunkirk", "106 minutos", "Christopher Nolan", "Guerra", LocalDate.of(2017, 7, 21), 'C', "Los ingleses se van de francia en barquitos"));
    }

  

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
    /* Pueda agregar un nuevo objeto tipo Pelicula al ArrayList.
       No se pueden agregar películas con clasificación E.
       No se pueden agregar películas cuya fecha de estreno sea anterior a la fecha actual.
    */
    public void agregarPelicula(int idPelicula, String titulo, String duracion,String director, String genero, LocalDate fechaEstreno, char clasificacion, String sinopsis​ ) throws IllegalArgumentException{
        if(titulo.isEmpty()){
            throw new IllegalArgumentException("Titulo vacio");
        }
        if(Character.toString(clasificacion).equalsIgnoreCase("E")){
            throw new IllegalArgumentException("El parametro calificacion no puede ser E.");
            
        }else if(fechaEstreno.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Parametro incorrecto, fecha de estreno anterior a la fecha actual.");
        }else{
            listaPeliculas.add(new Pelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis));
        }
        
        
    }
    
    
    public void modificarPelicula(int id_pelicula, String titulo, String duracion, String director, String genero, LocalDate fechaEstreno, char clasificacion, String sinopsis​ ) throws IllegalArgumentException {
        if(fechaEstreno.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Error! no se puede modificar una pelicula ya estrenada.");
        }else{
            listaPeliculas.set(id_pelicula,(new Pelicula(id_pelicula, titulo, duracion, director, genero, fechaEstreno,clasificacion,sinopsis)));
            
        }
        
    }

}
