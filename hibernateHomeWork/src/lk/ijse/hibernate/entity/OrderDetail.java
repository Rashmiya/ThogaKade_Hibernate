package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private String id;
    @ManyToOne
    private Order orderDetail_orders;
    @ManyToOne
    private Item oderDetail_item;
    private int oderDetail_qty;
    private double oderDetail_unitPrice;

    public OrderDetail(String id, Order orderDetail_orders, Item oderDetail_item, int oderDetail_qty, double oderDetail_unitPrice) {
        this.id = id;
        this.orderDetail_orders = orderDetail_orders;
        this.oderDetail_item = oderDetail_item;
        this.oderDetail_qty = oderDetail_qty;
        this.oderDetail_unitPrice = oderDetail_unitPrice;
    }

    public OrderDetail() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrderDetail_orders() {
        return orderDetail_orders;
    }

    public void setOrderDetail_orders(Order orderDetail_orders) {
        this.orderDetail_orders = orderDetail_orders;
    }

    public Item getOderDetail_item() {
        return oderDetail_item;
    }

    public void setOderDetail_item(Item oderDetail_item) {
        this.oderDetail_item = oderDetail_item;
    }

    public int getOderDetail_qty() {
        return oderDetail_qty;
    }

    public void setOderDetail_qty(int oderDetail_qtyOnHand) {
        this.oderDetail_qty = oderDetail_qtyOnHand;
    }

    public double getOderDetail_unitPrice() {
        return oderDetail_unitPrice;
    }

    public void setOderDetail_unitPrice(double oderDetail_unitPrice) {
        this.oderDetail_unitPrice = oderDetail_unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", orderDetail_orders=" + orderDetail_orders +
                ", oderDetail_item=" + oderDetail_item +
                ", oderDetail_qty=" + oderDetail_qty+
                ", oderDetail_unitPrice=" + oderDetail_unitPrice +
                '}';
    }
}
