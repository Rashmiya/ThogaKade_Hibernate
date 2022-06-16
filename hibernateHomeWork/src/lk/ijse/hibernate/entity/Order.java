package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "`Order`")
public class Order {
    @Id
    private String id;
    @CreationTimestamp
    private LocalDate order_date;
    @ManyToOne
    private Customer customer;

    public Order() {
    }

    public Order(String id, LocalDate order_date, Customer customer) {
        this.id = id;
        this.order_date = order_date;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", order_date=" + order_date +
                ", customer=" + customer +
                '}';
    }
}
