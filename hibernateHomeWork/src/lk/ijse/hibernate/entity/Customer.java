package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList = new ArrayList<>();

    public Customer() {
    }

    public Customer(String id, String name, String address, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.orderList = orderList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}

