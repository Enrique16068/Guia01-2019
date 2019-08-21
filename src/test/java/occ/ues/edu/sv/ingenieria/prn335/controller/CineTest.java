/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.controller;

import java.time.LocalDate;
import occ.ues.edu.sv.ingenieria.prn335.entity.Pelicula;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author enrique
 */
public class CineTest {
    
    public CineTest() {
    }

    /**
     * Prueba unitaria con respecto al lanzamiento de excepciones.
     */
    /*
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        int idPelicula = 6;
        String titulo = "Dias de ira";
        String duracion = "dos horas, 30 minutos";
        String director = "Walter lopez";
        String genero = "Estrategia";
        LocalDate fechaEstreno = LocalDate.of(2018,11,22);
        char clasificacion = 'C';
        String sinopsis = "Muerte de la esposa hija del protagonista quien desea vengar la muerte de ellas";
        Cine instance = new Cine();
        //https://www.paradigmadigital.com/dev/nos-espera-junit-5/  (Bibliografia)
        Throwable exception= assertThrows(IllegalArgumentException.class, () ->{
        Pelicula result = instance.agregarPelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis);
        });
        assertEquals("Parametro incorrecto, fecha de estreno anterior a la fecha actual.",exception.getMessage());
    }
    */
    /**
     * Prueba unitaria con respecto al agregado de los datos sin excepcion.
     */
    /*
    @Test
    public void testAgregarPeliculaSinProblema() {
        System.out.println("agregarPelicula");
        int idPelicula = 6;
        String titulo = "Dias de ira";
        String duracion = "150 minutos";
        String director = "Walter Lopez";
        String genero = "Estrategia";
        LocalDate fechaEstreno = LocalDate.of(2019,11,22);
        char clasificacion = 'C';
        String sinopsis = "Muerte de la esposa hija del protagonista quien desea vengar la muerte de ellas";
        Cine instance = new Cine();
        //creo una "variable" de tipo pelicula llamada result (el que espero)  para comparar el resultado
        Pelicula result=new Pelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis);
        //agrego una pelicula nueva al arraylist para probar el metodo
        instance.agregarPelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis);
        //aqui se supone que compruebo que la pelicula que agregue fue insertada, con un assert del resultado que me da con el que yo espero
        assertEquals("Dias de ira", instance.listaPeliculas.get(5).getTitulo());
    }
    *//*
    @Test
    public void testModificarPelicula(){
        System.out.println("Modificar pelicula");
        int idPelicula=4;
        String duracion = "150 minutos";
        String director = "Walter Lopez";
        String genero = "Estrategia";
        LocalDate fechaEstreno = LocalDate.of(2019,11,22);
        char clasificacion = 'C';
        String sinopsis = "Muerte de la esposa hija del protagonista quien desea vengar la muerte de ellas";
        
        Cine instancia=new Cine();
        System.out.println(instancia.listaPeliculas.get((idPelicula-1)).getTitulo());
        instancia.modificarPelicula(idPelicula, "Modificada", duracion, director, genero, fechaEstreno,clasificacion, sinopsis);
        System.out.println(instancia.listaPeliculas.get((idPelicula-1)).getTitulo());
        assertEquals("Modificada",instancia.listaPeliculas.get((idPelicula-1)).getTitulo() );
    }*/

}
