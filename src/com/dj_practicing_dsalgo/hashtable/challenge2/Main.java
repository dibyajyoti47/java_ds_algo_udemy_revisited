package com.dj_practicing_dsalgo.hashtable.challenge2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));
        HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
        ListIterator<Employee> itr = employees.listIterator();
        LinkedList<Employee> toBeRemovedElements = new LinkedList<Employee>();
        while(itr.hasNext()) {
            Employee emp = itr.next();
            if (map.containsKey(emp.getId())) {
                toBeRemovedElements.add(emp);
            } else {
                map.put(emp.getId(), emp);
            }
        }
        for (Employee emp : toBeRemovedElements) {
            employees.remove(emp);
        }
        employees.forEach(System.out::println);
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
