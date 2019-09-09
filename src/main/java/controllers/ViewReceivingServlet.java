package controllers;

import bean.ReceivedBean;
import model.Received;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "viewReceiving",urlPatterns = "/viewReceiving")
public class ViewReceivingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ReceivedBean receivedBean=new ReceivedBean();
        try{
            ArrayList<Received> receiving = receivedBean.getReceivings(); // Obtain a receiving receiving.
            req.setAttribute("receiving", receiving); // Store receiving in request scope.
            //req.getRequestDispatcher("view/viewProduct.jsp").forward(req, resp);
            req.getRequestDispatcher("view/addReceiving.jsp").forward(req, resp); // Forward to JSP page to display them in a HTML table.
        } catch (SQLException e) {
            throw new ServletException("Retrieving receiving failed!", e);
        }

    }

}
