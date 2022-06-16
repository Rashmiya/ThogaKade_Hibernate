package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    private String ItemCode;
    @Column(columnDefinition = "TEXT")
    private String description;
    private double unitPrice;
    private int qtyOnHand;

    @OneToMany(mappedBy = "oderDetail_item")
    private List<OrderDetail> orderDetailsList = new ArrayList<>();

    public Item() {
    }

    public Item(String itemCode, String description, double unitPrice, int qtyOnHand, List<OrderDetail> orderDetailsList) {
        ItemCode = itemCode;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
        this.orderDetailsList = orderDetailsList;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemCode='" + ItemCode + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
