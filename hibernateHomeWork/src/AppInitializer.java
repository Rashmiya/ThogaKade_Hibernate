import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.Order;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {
        //=============

        Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Rashmiya");
        c1.setAddress("Colombo");

        Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("Rafeek");
        c2.setAddress("Panadura");
//===========================
        Order O1 = new Order();
        O1.setId("O001");
        O1.setCustomer(c1);

        Order O2 = new Order();
        O2.setId("O002");
        O2.setCustomer(c1);

        ArrayList<Order> orderArrayList = new ArrayList();
        orderArrayList.add(O1);
        orderArrayList.add(O2);

        c1.setOrderList(orderArrayList);

//===========================
        Item I1 = new Item();
        I1.setItemCode("I001");
        I1.setDescription("Fresh milk");
        I1.setUnitPrice(120);
        I1.setQtyOnHand(100);

        Item I2 = new Item();
        I1.setItemCode("I002");
        I1.setDescription("Samba Rice 10Kg");
        I1.setUnitPrice(350);
        I1.setQtyOnHand(50);

//===========================
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //==============
        session.save(c1);
        session.save(c2);

        session.save(O1);
        session.save(O2);

        session.save(I1);
        session.save(I2);

//===========================
        Customer c001 = session.get(Customer.class, "C001");
        Customer c002 = session.get(Customer.class, "C002");

        Order o001 = session.get(Order.class, "O001");
        Order o002 = session.get(Order.class, "O002");

        Item i001 = session.get(Item.class, "I001");
        Item i002 = session.get(Item.class, "I002");


        System.out.println(c001);
        System.out.println(c002);

        System.out.println(o001);
        System.out.println(o002);

        System.out.println(i001);
        System.out.println(i002);
//===========================
        c1.setAddress("meepe");
        session.update(c1);

        O1.setCustomer(c2);
        session.update(c2);

        I1.setQtyOnHand(75);
        session.update(I1);
//===========================
        Customer c003 = session.get(Customer.class,"C002");
        session.delete(c003);

        Order o1 = session.get(Order.class,"O001");
        session.delete(o1);

        Item i1 = session.get(Item.class,"I002");
        session.delete(i1);
        
//===========================
        transaction.commit();
        session.close();
    }
}
