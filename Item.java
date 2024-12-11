
public abstract class Item {

    // private data 
    private String name;
    private double price;
    private int id;

    public Item(int id, String name, double price) {
        // no default cons will be used 
        this.id = id;
        this.name = name;
        this.price = price;

    }

    //getter and setters
    /* id getter and setter  */
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    /* price getter and setter */
    public double getprice() {
        return price;
    }

    public void setprice() {
        this.price = price;
    }

    /* name getter and setter*/
    public String getname() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

}
