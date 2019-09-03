package controllers;

import bean.ProductBean;
import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "viewProduct",urlPatterns = "/viewProduct")
public class ViewProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        ProductBean productBean = new ProductBean();
        try {
            ArrayList<Product> products = productBean.getProducts(); // Obtain a product products.
            req.setAttribute("products", products); // Store products in request scope.
            //req.getRequestDispatcher("view/viewProduct.jsp").forward(req, resp);
            req.getRequestDispatcher("view/addProduct.jsp").forward(req, resp); // Forward to JSP page to display them in a HTML table.
        } catch (SQLException e) {
            throw new ServletException("Retrieving products failed!", e);
        }
    }
}
