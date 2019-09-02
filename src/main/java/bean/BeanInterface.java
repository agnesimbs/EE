package bean;
import java.sql.*;
public interface BeanInterface<T> {
    Boolean create(T t)throws SQLException;
    T read()throws SQLException;
    Boolean update(T t)throws SQLException;
    T delete()throws SQLException;


}
