package Backend;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charly
 */
public class Customer {
    
    private String name, address, phone, email;
    
    public Customer(String name, String address, String phone, String email) {
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }
    
    public Customer(String name, String address, String phone) {
        this(name,address,phone,null);
    }
    
    public Customer (String name, String address) {
        this(name,address, null, null);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        String res="";
        res+=name+" - "+address;
        if (phone != null)
            res+=" - "+phone;
        if (email != null)
            res+=" - "+email;
        return res;
    }
}
