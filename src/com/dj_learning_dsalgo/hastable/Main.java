package com.dj_learning_dsalgo.hastable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee( 11 , "Jane", "Jones");
        Employee johnDoe = new Employee( 12 , "John", "Doe");
        Employee marySmith = new Employee( 13 , "Mary", "Smith");
        Employee mikeWilson = new Employee( 14 , "Mike","Wilson");
        Employee billEnd = new Employee( 15 , "Bill", "End");

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.printHashTable();
        System.out.println(ht.get("Doe"));
        System.out.println("----------------");
        System.out.println();
        System.out.println();
        System.out.println(ht.remove("Wilson"));
        System.out.println(ht.remove("Jones"));
        System.out.println(ht.get("Smith"));
    }
}
