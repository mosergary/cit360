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
        // sets are great for ensureing that duplicate entries are not made into an array.  example would be ssn#

        HashSet<String> number = new HashSet<String>();
        number.add("1");
        number.add("1");
        number.add("2");
        System.out.println(number);
        number.remove("1");
        System.out.println(number);

////////////////////////////////////////////////////////////////////////////////////////

        //TreeSet
        //Maintains ascending order
        //no duplicate it is a Set
        // this would work well to automatically alpha a list to display does not need addition sorting
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

        // this could be used in a program to sort tasks it will automatically put them in acending order
        TreeSet<Integer> studentNumber = new TreeSet<Integer>();
        Scanner myNumber = new Scanner(System.in);
        System.out.println(" Enter your student number");
        String inputNumber = myNumber.nextLine();
        String numberToParse = inputNumber;

        int student = Integer.parseInt(numberToParse);
        studentNumber.add(student);
        System.out.println(studentNumber);


        //////////////Parse use input to string


/////////////////Map/////////////////////////////////////////////////////////////////////////////////////////

////////When using a Map make sure the key is only going to be used once or it will ignore the previous entries
///the first example show that if you use cities in this example as the key because boise has more
//than one zip code it will ignore the first enty
        System.out.println("\n " + "/////////////  Map   //////////////////////////");

        Map<String,Integer> zip = new HashMap<String,Integer>();
zip.put("boise", 83706);
zip.put("boise",83702);
zip.put("Meridian", 83686);
zip.put("Caldwell",83607);

System.out.println(zip);
System.out.println(zip.get("boise"));

        Set<Map.Entry<String,Integer>> idaho = zip.entrySet();
for (Map.Entry<String,Integer> out:idaho ) {
    System.out.println(out.getKey() + ":" + out.getValue());
}

/////////the Better way is to use the zip code as the key that way you can call boise multiple time
// //because it has more than one zip code
        Map<Integer,String> zip2 = new HashMap<Integer, String>();
        zip2.put(83706,"boise");
        zip2.put(83686, "Meridian");
        zip2.put(83607,"caldwell");
        zip2.put(83704,"boise");

        System.out.println(zip2);


        Set<Map.Entry<Integer,String>>idaho2 = zip2.entrySet();
        for (Map.Entry<Integer,String> out:idaho2 ) {
            System.out.println(out.getKey() + ":" + out.getValue());
        }
        System.out.println(zip2.get(83706));
        System.out.println(zip2.get(83704));

//ask user to enter in zip code it will compare zipcode to map and output the city

        Scanner myZip = new Scanner(System.in);
        System.out.println("Enter in ZipCode 83706, 83686,83607,83704");
        String userZip = myZip.nextLine();
        int result = Integer.parseInt(userZip);
        System.out.println("your zip code is in " + zip2.get(result));


///////////////////////////////////       Queue   ////////////////////////////////////

        System.out.println("\n " + "/////////////  Queue   //////////////////////////");

        Queue<String> course = new LinkedList<>();
        course.add("cit260");
        course.add("cit360");
        course.add("cit460");
        course.add("cit160");
        System.out.println(course);

        course.add("this is the new added course");

        System.out.println(course);
        System.out.println("notice is is added to the tail not to the front of the queue");

        course.remove();

        System.out.println(course);
        System.out.println("notice when you remove it pull the first one away");

        System.out.println(course.peek());

        System.out.println("this one will show them element in the first spot");

        System.out.println(course.size());
        System.out.println("this shows how many element are currently in your queue");

        //ask user for input tells the user when ther item is in the queue
        Scanner myQueue = new Scanner(System.in);
        System.out.println("Enter a class");
        String userClass = myQueue.nextLine();
        course.add(userClass);
        System.out.println(course);
        System.out.println("Your class is " + course.size() + "th from the beginning");


}














        }




