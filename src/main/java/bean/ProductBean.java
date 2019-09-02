package bean;

import dao.DbHandler;
import model.Category;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductBean implements BeanInterface{

    public Boolean addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO product(name,description) VALUES(?,?); ";
        Connection conn = DbHandler.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);
        //ps.setInt(1, product.getId());
        ps.setString(1, product.getName());
        ps.setString(2, product.getDescription());
        return ps.executeUpdate() > 0;


    }
    public Product viewProduct(String id) throws SQLException {
        String sql = "select * from product WHERE id=" + id;
        ResultSet rs=DbHandler.readFromDb(sql);
        Product product = new Product();
        if (rs.next()) {
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setDescription(rs.getString("description"));
           // product.getCategory_id(rs.getString("category_id"));
        }
        /* if (conn!=null) {
            conn.close();
        }
        if(stmt!=null) {
            stmt.close();
        }
        if (rst!=null) {
            rst.close();
        }
*/return product;

    }
    public Boolean updateProduct(Product product) throws SQLException {
        String query = "UPDATE product SET name=?,description=? where id=?";
        Connection conn = DbHandler.getConnection();


        PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1, product.getName());
        ps.setString(2, product.getDescription());
        ps.setInt(3, product.getId());
        return ps.executeUpdate() > 0;
    }

    public Boolean deleteProduct(Product product) throws SQLException {
        String sql = "DELETE  FROM product where id=?";
        Connection conn = DbHandler.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, product.getId());
        return ps.executeUpdate() > 0;



    }
    public ArrayList<Product> getProducts() throws SQLException {
        String query = "SELECT * FROM product";

        ResultSet rs =  DbHandler.readFromDb(query);
        ArrayList<Product> productList = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product( rs.getString("name"), rs.getString("description"));
            productList.add(product);

        }
        return productList;
    }


    @Override
    public Boolean create(Object o) throws SQLException {
        return null;
    }

    @Override
    public Object read() throws SQLException {
        return null;
    }

    @Override
    public Boolean update(Object o) throws SQLException {
        return null;
    }

    @Override
    public Object delete() throws SQLException {
        return null;
    }
}
