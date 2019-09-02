package bean;

import dao.DbHandler;

import model.Received;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceivedBean implements BeanInterface {
    public Boolean addReceiving(Received received) throws SQLException {
        String sql = "INSERT INTO received(batch_no,product_id,quantity_received) VALUES(?,?,?); ";
        Connection conn = DbHandler.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);
        //ps.setInt(1, product.getId());
        ps.setInt(1, received.getBatch_no());
        ps.setInt(2, received.getProduct_id());
        ps.setInt(3, received.getQuantityReceived());

        return ps.executeUpdate() > 0;


    }
    public static Received viewReceiving(String id) throws SQLException {
        String sql = "select * from received WHERE product_id=" + id;
        ResultSet rs=DbHandler.readFromDb(sql);
       Received received = new Received();
        if (rs.next()) {
            received.setBatch_no(rs.getInt("batch_no"));
            received.setProduct_id(rs.getInt("product_id"));
            received.setDate(rs.getDate("date"));
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
*/return received;

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
