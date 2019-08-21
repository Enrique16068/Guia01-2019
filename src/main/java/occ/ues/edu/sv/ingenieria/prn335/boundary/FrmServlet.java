package occ.ues.edu.sv.ingenieria.prn335.boundary;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import occ.ues.edu.sv.ingenieria.prn335.controller.Cine;

@WebServlet(name = "FrmServlet", urlPatterns = {"/FrmServlet"})
public class FrmServlet extends HttpServlet {

    Cine proceso = new Cine();
    String valor;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            int tamaño = proceso.getListaPeliculas().size();
            try {
                proceso.agregarPelicula((tamaño + 1), request.getParameter("Titulo"), request.getParameter("Duracion"), request.getParameter("Director"), request.getParameter("Genero"), LocalDate.of(Integer.parseInt(request.getParameter("fechaEstreno").substring(0, 4)), Integer.parseInt(request.getParameter("fechaEstreno").substring(5, 7)), Integer.parseInt(request.getParameter("fechaEstreno").substring(8, 10))), request.getParameter("clasificacion").charAt(0), request.getParameter("sinopsis"));
                if (request.getParameter("Agregar") != null) {

                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Peliculas</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<table border=1 style=width:80%>");

                    out.println("<tr>");

                    out.println("<th>Id</th>");
                    out.println("<th>Pelicula</th>");
                    out.println("<th>Duracion</th>");
                    out.println("<th>Director</th>");
                    out.println("<th>Genero</th>");
                    out.println("<th>Fecha</th>");
                    out.println("<th>Clasificacion</th>");
                    out.println("<th>Sinopsis</th>");

                    out.println("</tr>");

                    for (int inicio = 0; inicio < tamaño + 1; inicio++) {
                        out.println("<tr>");

                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getIdPelicula() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getTitulo() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getDuracion() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getDirector() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getGenero() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getFechaEstreno() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getClasificacion() + "</td>");
                        out.println("<td>" + proceso.getListaPeliculas().get(inicio).getSinopsis() + "</td>");

                        out.println("</tr>");
                    }

                    out.println("</table>");

                } else if (request.getParameter("Modificar") != null) {
                    valor = request.getParameter("Modificar");
                    out.println("<h1> hola  " + valor + "</h1>");
                }
                out.println("</body>");
                out.println("</html>");

            } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
                out.println("<h1>" + e.getMessage() + "</h1>");

            }
            //valor = "Parametros vacios, Complete el formulario por favor";
            out.println("<form action=/guia01-lunes-master>");
            out.println("<input type=submit value=Regresar>");
            out.println("</form>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
