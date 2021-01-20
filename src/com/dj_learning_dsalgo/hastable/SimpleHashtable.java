package com.dj_learning_dsalgo.hastable;

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

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length-1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex
                    && hashtable[hashedKey] != null
                    && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = ( hashedKey + 1 ) % hashtable.length;
        }
        if (stopIndex == hashedKey) {
            return -1;
        } else {
            return hashedKey;
        }
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
