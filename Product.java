
import java.util.Date;

public class Product extend Person{

    private String category;
    private Date productionDate;
    private Date ExpDate;
    private int quantity;

    /*constructor*/
    public Product(String category, Date productionDate, Date ExpDate, int quantity) {
        this.category = category;
        this.productionDate = productionDate;
        this.ExpDate = ExpDate;
        this.quantity = quantity;
    }

    //getters and setters 
    /*category getter and setter*/
    public String getCategory() {
        return category;
    }

    public void setCategoty() {
        this.category = category;
    }

    /*productionDate getter and setter*/
    public Date getproductionDate() {
        return productionDate;
    }

    public void setproductionDate() {
        this.productionDate = productionDate;
    }

    /*expdate getter and setters */
    public Date getExpDate() {
        return ExpDate;
    }

    public void setExpDate() {
        this.ExpDate = ExpDate;
    }

    /*qauntity getter and setter*/
    public int getquantity() {
        return quantity;
    }

    public void setquantity() {
        this.quantity = quantity;
    }

}
