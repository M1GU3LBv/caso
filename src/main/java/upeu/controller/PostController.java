package upeu.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.dao.PostDao;
import upeu.daoImpl.PostDaoImpl;
import upeu.entity.Post;

/**
 *
 * @author admin
 */
public class PostController extends HttpServlet {
    private PostDao dao = new PostDaoImpl();
    private Gson gson = new Gson();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int op = Integer.parseInt(request.getParameter("opc"));
        switch(op){
            case 1: out.println(gson.toJson(dao.readAll()));
                break;
            case 2:out.println(gson.toJson(dao.create(new Post(0, request.getParameter("titulo"), request.getParameter("desc")))));
                break;
            case 3:out.println(gson.toJson(dao.delete(Integer.parseInt(request.getParameter("id")))));
                break;
            case 4: out.println(gson.toJson(dao.read(Integer.parseInt(request.getParameter("id")))));
                break;
            case 5:out.println(gson.toJson(dao.update(new Post(Integer.parseInt(request.getParameter("id")), request.getParameter("titulo"), request.getParameter("desc")))));
                break;
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
