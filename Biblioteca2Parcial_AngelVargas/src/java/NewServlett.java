/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import Clases.Libro;
import Clases.LibroController;
import Clases.ConexionBaseDeDatos1;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author JP
 */
@WebServlet(urlPatterns = {"/NewServlett"})
public class NewServlett extends HttpServlet {
    Libro libro;
    LibroController registroLibro;
     Libro[] librosRegistrados;
     StringBuffer objetoRespuesta = new StringBuffer();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        try ( PrintWriter respuesta = response.getWriter()) {            
           
           registroLibro=new LibroController();
           String control = request.getParameter("control");
           
           if(control.toUpperCase().equals("GUARDAR")){
               libro=new Libro(
                Integer.parseInt(request.getParameter("codigo")),
                request.getParameter("nombre"),
                request.getParameter("Pasta"),
                request.getParameter("editorial"),
                request.getParameter("publicacion"),     
                Integer.parseInt(request.getParameter("opcion")));                
                registroLibro.guardarCliente2(libro);//almacenarlo en BD                 
           }else if(control.toUpperCase().equals("ELIMINAR")){
               int codigoEliminar= Integer.parseInt(request.getParameter("codigo_cliente"));
               registroLibro.eliminarCliente(codigoEliminar);
           }
                        
            
            //registroAlumno.guardarCliente(libro);//almacenarlo en el array
            //alumnosRegistrados= registroLibro.getClientes();// consultar alumnos en el array                       
                    
           registroLibro.getClientes2(objetoRespuesta);//consultar alumnos en la BD
           respuesta.write(objetoRespuesta.toString());             
            
           
            /*for (int i = 0; i < librosRegistrados.length; i++){
                   //if(!librosRegistrados[i].getCodigo().isEmpty()){
                    if(librosRegistrados[i].getCodigo()>0){
                       respuesta.println("<tr><td>" + librosRegistrados[i].getCodigo()+ "</td>");
                       respuesta.println("<td>" + librosRegistrados[i].getNombre() + "</td>");
                       respuesta.println("<td>" + librosRegistrados[i].getDireccion()+ "</td>");
                       respuesta.println("<td>" + librosRegistrados[i].getCorreo()+ "</td>");
                       respuesta.println("<td>" + librosRegistrados[i].getTipo()+ "</td>");
                       respuesta.println("<td>"
                               + "<button type=\"button\" class=\"btn btn-warning\"></i>Editar</button> "
                               + "<button type=\"button\" class=\"btn btn-danger\">Eliminar</button>"
                               + "</td></tr>");
                    }
                }*/
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
