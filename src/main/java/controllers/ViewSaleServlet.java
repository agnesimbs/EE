package controllers;

import bean.SaleBean;
import model.Sale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(value = "name=viewSale",urlPatterns = "/viewSale")
public class ViewSaleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        SaleBean saleBean = new SaleBean();
        try {
            ArrayList<Sale> sales = saleBean.getSales(); // Obtain a sale sales.
            req.setAttribute("sales", sales); // Store sales in request scope.
            //req.getRequestDispatcher("view/viewSale.jsp").forward(req, resp);
            req.getRequestDispatcher("view/addSale.jsp").forward(req, resp); // Forward to JSP page to display them in a HTML table.
        } catch (SQLException e) {
            throw new ServletException("Retrieving sales failed!", e);
        }

    }
}
