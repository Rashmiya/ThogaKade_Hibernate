import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //==============
        session.save(c1);
        session.save(c2);

        Customer c001 = session.get(Customer.class, "C001");
        Customer c002 = session.get(Customer.class, "C002");

        System.out.println(c001);
        System.out.println(c002);

        c1.setAddress("meepe");
        session.update(c1);

        Customer c003 = session.get(Customer.class,"C002");
        session.delete(c003);

        transaction.commit();
        session.close();
    }
}
