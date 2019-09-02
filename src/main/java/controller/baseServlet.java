package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/servletTest")
public class baseServlet extends HttpServlet {
    public void auth(HttpServletRequest req){
        HttpSession s=req.getSession();
        s.setAttribute("logged",true);

    }
    public void isLoggedin(HttpServletRequest req) {
        HttpSession s = req.getSession();
       // return s != null && s.getAttribute("logged");

    }


}
