package com.dj_practicing_dsalgo.hashtable;

import com.dj_practicing_dsalgo.common.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee( 11 , "Jane", "Jones");
        Employee johnDoe = new Employee( 12 , "John", "Doe");
        Employee marySmith = new Employee( 13 , "Mary", "Smith");
        Employee mikeWilson = new Employee( 14 , "Mike","Wilson");
        Employee billEnd = new Employee( 15 , "Bill", "End");

        Hashtable<String, Employee> ht = new Hashtable<>();
        ht.put(janeJones.getLastName(), janeJones);
        ht.put(johnDoe.getLastName(), johnDoe);
        ht.put(marySmith.getLastName(), marySmith);
        ht.put(mikeWilson.getLastName(), mikeWilson);
        ht.put(billEnd.getLastName(), billEnd);
//        ht.printHashtable();
        System.out.println(ht.get("Wilson"));
    }
}
