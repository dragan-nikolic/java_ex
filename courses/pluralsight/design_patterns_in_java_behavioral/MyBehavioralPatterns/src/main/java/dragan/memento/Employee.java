package dragan.memento;

import java.io.Serializable;

// originator
public class Employee implements Serializable {
    private String name;
    private String address;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
