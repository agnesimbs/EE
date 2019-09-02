package bean;

import dao.DbHandler;
import model.Category;
import model.Product;

import java.sql.ResultSet;
import java.util.Scanner;

import java.sql.SQLException;

public class CategoryBean implements BeanInterface<Category> {

    Scanner input = new Scanner(System.in);

    public void addCategory(Category category) throws SQLException {
        String sql = "insert into category (name,description)values('"+category.getName()+"','"+category.getDescription()+"')";
        DbHandler DbHandlerobject = new DbHandler();
        DbHandlerobject.writeDb(sql);

    }

    public void viewCategory() throws SQLException {
        String sql = "select * from category";
        DbHandler DbHandlerobject = new DbHandler();
        DbHandlerobject.readFromDb(sql);


    }
    public void updateCategory(Category category){





    }
    public void deleteCategory(){


    }

    @Override
    public Boolean create(Category category) throws SQLException {
        return null;
    }

    @Override
    public Category read ()throws SQLException {

        return null;
    }

    @Override
    public Boolean update(Category category) throws SQLException {
        return null;
    }

    @Override
    public Category delete() throws SQLException {
        return null;
    }
}
