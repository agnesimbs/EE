package bean;

import model.Product;
import model.User;
import dao.DbHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBean implements BeanInterface {
    public boolean create(User user) throws SQLException {
        String query = "INSERT INTO user(id,name,password) values(?,?,?)";
        Connection conn = DbHandler.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1,user.getId());
        ps.setString(2,user.getUsername());
        ps.setString(2,user.getPassword());
        return ps.executeUpdate()>0;
    }
    public User viewUser(String id) throws SQLException {
        String sql = "select * from user WHERE id=" + id;
        ResultSet rs = DbHandler.readFromDb(sql);
        User user = new User();
        if (rs.next()) {
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
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
*/
        return user;

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
