package com.dj_learning_dsalgo.hastable.simplehashtable;

import com.dj_learning_dsalgo.hastable.Employee;

public class SimpleHashtable {

    private StoredEmployee [] hashtable;

    public SimpleHashtable () {
        hashtable = new StoredEmployee[10];
    }

    public void put (String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length-1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = ( hashedKey + 1 ) % hashtable.length;
            }
        }
        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position" + hashedKey);
        } else {
            hashtable [hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get (String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1 ) return null;
        return hashtable[findKey(key)].employee;
    }

    public Employee remove (String key) {
        int hashedkey = findKey(key);
        if (hashedkey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedkey].employee;
        hashtable[hashedkey] = null;
        StoredEmployee [] oldHashtable = hashtable;
        hashtable = new StoredEmployee[hashtable.length];
        for (int i = 0; i < oldHashtable.length; i++) {
            if (oldHashtable[i] != null)
                put(oldHashtable[i].key, oldHashtable[i].employee);
        }

        return employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length-1)
            hashedKey = 0;
        else
            hashedKey++;
        while (hashedKey != stopIndex
                    && hashtable[hashedKey] != null
                    && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = ( hashedKey + 1 ) % hashtable.length;
        }
        if (hashtable[hashedKey] !=null && hashtable[hashedKey].key.equals(key))
            return hashedKey;
        else
            return -1;
    }

    private boolean isOccupied (int index) {
        return hashtable[index] != null;
    }

    public void printHashTable () {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null)
                System.out.println("- - Empty - -");
             else
                System.out.println(hashtable[i]);
        }
    }

    private int hashKey (String key) {
        return key.length() % hashtable.length;
    }
}
