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

@WebServlet(name="addSale",urlPatterns = "/addProduct")
public class AddSaleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        req.getRequestDispatcher("/view/addSale.jsp").forward(req,resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        SaleBean saleBean = new SaleBean();

        //int productId = Integer.parseInt(req.getParameter("productId"));
        int sellingPrice = Integer.parseInt(req.getParameter("sellingPrice"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        Sale sale = new Sale(sellingPrice,quantity);
        try {
            // productBean.addProduct(product);
            if( saleBean.addSale(sale)){
                resp.sendRedirect("/view/viewSale");
            }
        } catch (SQLException |NumberFormatException e) {
            throw new ServletException("Failure in adding the sale", e);
        }



    }


}
