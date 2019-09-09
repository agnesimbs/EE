package model;
import java.util.Date;
public class Received {
    int id;
    int batch_no;
    Date date;
    int product_id;
    int quantityReceived;
    int running_balance;
    double buyingPrice;
    double sellingPrice;

    public Received(int batch_no,int product_id,int quantityReceived,double buyingPrice,double sellingPrice){
        this.batch_no=batch_no;
        this.product_id=product_id;
        this.quantityReceived=quantityReceived;
        this.buyingPrice=buyingPrice;
        this.sellingPrice=sellingPrice;

    }

    public Received() {

    }

    public Received(int batchno, int quantityReceived) {
        this.batch_no=batch_no;
        this.quantityReceived=quantityReceived;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(int batch_no) {
        this.batch_no = batch_no;
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

    public int getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(int quantity_received) {
        this.quantityReceived = quantity_received;
    }

    public int getRunning_balance() {
        return running_balance;
    }

    public void setRunning_balance(int running_balance) {
        this.running_balance = running_balance;
    }
}
