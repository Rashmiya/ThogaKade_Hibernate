import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        //=============

       /* Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Rashmiya");
        c1.setAddress("Nugegoda");

        Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("Rafeek");
        c2.setAddress("Panadura");

        Item item1 = new Item();
        item1.setItemCode("I001");
        item1.setDescription("cake");
        item1.setUnitPrice(560);
        item1.setQtyOnHand(10);

        Item item2 = new Item();
        item2.setItemCode("I002");
        item2.setDescription("Fresh milk");
        item2.setUnitPrice(1200);
        item2.setQtyOnHand(22);*/

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //==============

        transaction.commit();
        session.close();
    }
}
