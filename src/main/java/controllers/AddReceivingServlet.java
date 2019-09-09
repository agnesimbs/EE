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

@WebServlet( "name=addReceiving,urlPatterns =/addReceiving")
public class AddReceivingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        req.getRequestDispatcher("/view/addReceiving.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        ReceivedBean receivedBean=new ReceivedBean();
        int batch_no=Integer.parseInt(req.getParameter("batch_no"));
        int quantityReceived=Integer.parseInt(req.getParameter("quantityReceived"));
        //nt batchno=Integer.parseInt(req.getParameter("batchno"));
        Received received=new Received(batch_no,quantityReceived);
        try {
            receivedBean.addReceiving(received);
            /*if( receivedBean.addReceiving(received)){
                resp.sendRedirect("viewReceiving");
            }*/
        } catch (SQLException |NumberFormatException e) {
            throw new ServletException("Failure in addiing the receiving", e);
        }

    }

}
