package bean;

import dao.DbHandler;


import model.Sale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaleBean implements BeanInterface{
    public Boolean addSale(Sale sale) throws SQLException {
        String sql = "INSERT INTO sale(product_id,selling_price,quantity_sold) VALUES(?,?,?); ";
        Connection conn = DbHandler.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);
        //ps.setInt(1, product.getId());
        ps.setInt(1, sale.getProduct_id());
        ps.setInt(2, (int) sale.getSelling_price());
        ps.setInt(3, sale.getQuantity());

        return ps.executeUpdate() > 0;


    }
    public static Sale viewSale(String id) throws SQLException {
        String sql = "select * from sale WHERE product_id=" + id;
        ResultSet rs=DbHandler.readFromDb(sql);
        Sale sale = new Sale();
        if (rs.next()) {
            sale.setProduct_id(rs.getInt("product_id"));
            sale.setSelling_price(rs.getInt("selling_price"));
            sale.setQuantity(rs.getInt("quantity_sold"));
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
*/return sale;

    }
    public static ArrayList<Sale> getSales() throws SQLException {
        String query = "SELECT * FROM sale";

        ResultSet rs =  DbHandler.readFromDb(query);
        ArrayList<Sale> saleList = new ArrayList<>();
        while (rs.next()) {
            Sale sale = new Sale( rs.getInt("product_id"), rs.getInt("selling_price"), rs.getInt("quantity_sold"));
           saleList.add(sale);

        }
        return saleList;
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
