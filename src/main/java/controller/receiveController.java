package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/servletTest")
public class receiveController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        if(req.getParameter("pages").equals("receive")) {
            req.getRequestDispatcher("view/receive.html").forward(req, resp);
        }
        else if (req.getParameter("pages").equals("sale")){
            req.getRequestDispatcher("view/sale").forward(req, resp);


        }
        else if (req.getParameter("pages").equals("login")){
            req.getRequestDispatcher("view/login").forward(req, resp);


        }
    }
}
