package com.cit360;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    //Collections examples
////////////////////////////////////////////////////////////////////////////////////
        System.out.println("/////////    ArrayList  ////////////////" +"\n");
     //ArrayList- Great for store a list but does not retain any order
        ArrayList<String>  animal = new ArrayList<String>();
        animal.add("Zebra");
        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Bear");
        //iterator example from javatpoint.com
        Iterator i=animal.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n"+"Remove two items"+"\n");

        animal.remove("Zebra");
        animal.remove("Bear");

        Iterator j=animal.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }

        System.out.println("\n" +"Order not maintained after list add just goes to the end"+"\n");
        animal.add("Zebra");
        animal.add("Bear");

        Iterator k=animal.iterator();
        while(k.hasNext()){
            System.out.println(k.next());
        }

///////////////////////////////////////////////////////////////////////////////////////

    //Vector capacity it 10 then double when it receives a 11.  capacity can also be set
        //and increase at a specified size

        //using default
        System.out.println("\n"+"///////////////   Vector  ////////////////////"+ "\n");

        Vector car = new Vector();
        System.out.println("Vector Size " + car.size());
        System.out.println("Initial vector Capacity " + car.capacity());
        car.addElement("Ford");
        car.addElement("Chevy");
        car.addElement("Dodge");
        car.addElement("Mazda");
        car.addElement("Datsun");
        car.addElement("Toyota");
        car.addElement("Lexus");
        car.addElement("Subaru");
        car.addElement("Saab");
        car.addElement("Lincoln");
        //add 10 elements
        System.out.println("Vector Size " + car.size());
        System.out.println(car+"\n");

        //add 11 and check capacity
        car.addElement("GMC");
        System.out.println("Added GMC");
        System.out.println(car);
        System.out.println("Add 11th element Vector Size " + car.size());
        System.out.println("Vector Capacity " + car.capacity());

        // Vectors you can replace item using the index of where the item is in an array
        System.out.println("\n"+"Replace index 5 and 7 with other elements"+"\n");
        car.set(5, "New Model");
        car.set(7, "another replacement");

        System.out.println(car);
        //Sort Vector
        System.out.println("\n"+"Sorting a vector");

        Collections.sort(car);
        System.out.println(car);

        //Search an index
        System.out.println("\n"+ "Searching an index");
        int locateIndex = car.indexOf("Ford");
        System.out.println("Ford is at index "+ locateIndex);
        System.out.println(car);

/////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n"+ "//////////////  Linked List  //////////////" +"\n");
        //link list use array and can maintain order

        LinkedList<String> computers = new LinkedList<String>();
        computers.add("Dell");
        computers.add("Lenovo");
        computers.add("HP");
        computers.add("Toshiba");

        System.out.println("\n"+"Initial List");
        System.out.println(computers+"\n");

        computers.add(3,"Compaq");
        System.out.println("\n"+ "added Compaq to 3rd element");
        System.out.println(computers);

        //Combiine 2 link lists

        LinkedList<String> computers2 = new LinkedList<String>();
        computers2.add("AlienWare");
        computers2.add("ASUS");
        computers2.add("Apple");
        System.out.println("List 2");
        System.out.println(computers2+"\n");

        System.out.println("merge list one and two");
        computers.addAll(computers2);
        System.out.println(computers);

////////////////////////////////////////////////////////////////////////////////////

        //HashSet
        // ignores duplicates one of the differences between a list and a set

        HashSet<String> number = new HashSet<String>();
        number.add("1");
        number.add("1");
        number.add("2");
        System.out.println(number);
        number.remove("1");
        System.out.println(number);

////////////////////////////////////////////////////////////////////////////////////////

        //TreeSee
        //Maintains ascending order
        //no duplicate it is a Set
        System.out.println("\n"+ "TreeSet"+"\n"+"Maintains order number added at random");
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(12);
        tree.add(3);
        tree.add(5);
        System.out.println(tree);

        //add a number
        tree.add(6);
        //duplicate is ignored
        tree.add(1);
        System.out.println("\n"+ "added 1 and 6,  one is ignored and 6 is put in order");
        System.out.println(tree);











        }

    }


