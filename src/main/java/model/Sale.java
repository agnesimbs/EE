package model;
import java.util.Date;
public class Sale {
    int id;
    Date date;
    int product_id;
    int quantity;
    int selling_price;

    public Sale(int product_id,int selling_price,int quantity){
        this.product_id=product_id;
        this.quantity=quantity;
        this.selling_price=selling_price;

    }

    public Sale() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }
}
