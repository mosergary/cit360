package com.garymoser.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//  followed the video by brother Tuckett
import java.util.List;

public class TestDAO {
    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO() {
        factory = HibernateUtils.getSessionFactory();
    }

    public static TestDAO getInstance(){
        if (single_instance == null) {
            single_instance = new TestDAO();
        }

        return single_instance;
    }

    public List<Customer> getCustomer() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "From com.garymoser.hibernate.Customer";
            List<Customer> cs = (List<Customer>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }
}
