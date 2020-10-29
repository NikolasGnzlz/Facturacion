package controler;


import dtos.ClienteDTO;
import services.ClienteService;

import services.impl.ClienteServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




public class ClienteControler extends HttpServlet {


        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

            ClienteService clienteService = new ClienteServiceImpl();

        clienteService.consultarCliente((Integer.parseInt(req.getParameter("idCliente"))));  //(Integer.parseInt(req.getParameter("id")))

                // Obtenemos un objeto Print Writer para enviar respuesta
        res.setContentType("text/html");
                PrintWriter pw = res.getWriter();
        pw.println("<html><head>");
        pw.println("<TITLE>Servlet Curso Java Metodo GET</TITLE>");
        pw.println("</head><body>");
        pw.println("<p>Llamar al recurso Articulo</p>");
        pw.println("</body>");
        pw.close();


        }
            public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

                ClienteDTO clienteDTO = new ClienteDTO();
                ClienteService clienteService = new ClienteServiceImpl();


                clienteDTO.setNombre(req.getParameter("nombre"));

                clienteService.ingresarCliente(clienteDTO);

                res.setContentType("text/html");
                PrintWriter pw = res.getWriter();
                pw.println("<html><head>");
                pw.println("<TITLE>Servlet Curso Java Método Post</TITLE>");
                pw.println("</head><body>");
                pw.println("<p>Llamar al recurso Articulo</p>");
                pw.println(req.getParameter("descripcion"));
                pw.println(req.getParameter("precio"));
                pw.println("</body>");
                pw.close();


            }


            public void doPut (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


            }


            protected void doDelete (HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

            }


}
