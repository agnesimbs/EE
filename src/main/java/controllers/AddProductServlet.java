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

@WebServlet(name="addProduct",urlPatterns ="/addProduct")
public class AddProductServlet extends HttpServlet {
        //ProductBean productBean = null;

        /*public void init() throws ServletException {
            //ProductBean  productBean = new ProductBean();
        }
*/
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //super.doGet(req, resp);
                req.getRequestDispatcher("/view/addProduct.jsp").forward(req, resp);

        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                //super.doPost(req, resp);
            ProductBean  productBean = new ProductBean();

                        //int productId = Integer.parseInt(req.getParameter("productId"));
                        String productName = req.getParameter("productName");
                        String productDescription = req.getParameter("productDescription");
                        Product product = new Product(productName, productDescription);
            try {
                       // productBean.addProduct(product);
                        if( productBean.addProduct(product)){
                               resp.sendRedirect("viewProduct");
                        }
                } catch (SQLException |NumberFormatException e) {
                        throw new ServletException("Failure in addiing the product", e);
                }
        }

}
