
public class Person {

    // private data 
    private String name;
    private String email;
    private String contactInfo;

    /*constructor */
    public Person(String name, String email, String contactInfo) {
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
    }

    //getter and setter  
    /*name getter and setter  */
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    /* email getter and setter */
    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    /* contactInfo getter and setter */
    public String getcontactInfo() {
        return name;
    }

    public void setcontactInfo() {
        this.contactInfo = contactInfo;
    }

}
