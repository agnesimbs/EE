package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "login")
public class login extends HttpServlet {
    private User user=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
       // req.getRequestDispatcher("view/login").forward(req, resp);

    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameterValues(user.getUsername());
        req.getParameterValues(user.getPassword());
        if(user ==null){
            resp.sendRedirect("view/login");
        }


    }
}
