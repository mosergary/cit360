package com.garymoser.hibernate;
import java.util.*;
//  followed the video by brother Tuckett
public class RunHibernateExample {

    public static void main(String[] args) {
        TestDAO t = TestDAO.getInstance();

        List<Customer> c = t.getCustomer();
        for (Customer i : c) {
            System.out.println();
        }

    }
}
