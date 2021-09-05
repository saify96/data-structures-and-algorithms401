package hash;

import java.util.NoSuchElementException;

public class HashTable<K, T> {
    Node<K, T>[] tableArray;

    public HashTable(int size) {
        tableArray = new Node[size];
    }

    public int GetHash(K key) {
        int sumOfAscii = 0;
        for (int i = 0; i < key.toString().length(); i++) {
            sumOfAscii += (int) key.toString().charAt(i);
//            System.out.println((int) key.charAt(i));
        }
        return (sumOfAscii * 599) % tableArray.length;
    }

    public void addToHashTable(K key, T value) {
        int hashedKeyIdx = GetHash(key);
        if (tableArray[hashedKeyIdx] == null) {
            tableArray[hashedKeyIdx] = new Node<>(key, value);
        } else {
            if (key == tableArray[hashedKeyIdx].getKey()) {
                tableArray[hashedKeyIdx].setValue(value);
            } else {
                Node<K, T> newItem = new Node(key, value);
                tableArray[hashedKeyIdx].next = newItem;
            }
        }
    }

    public T get(K key) {
        int hashedKeyIdx = GetHash(key);
        if (tableArray[hashedKeyIdx] != null) {
            if (key == tableArray[hashedKeyIdx].getKey()) {
                return tableArray[hashedKeyIdx].getValue();
            } else {
                Node<K, T> current = tableArray[hashedKeyIdx];
                while (current.next != null) {
                    if (current.next.getKey() == key) {
                        return (T) current.next.value;
                    }
                    current = current.next;
                }
            }
        }
        throw new NoSuchElementException("There is no element with such Key");
    }

    public boolean contain(K key) {
        int hashedKeyIdx = GetHash(key);
        if (tableArray[hashedKeyIdx] != null) {
            if (tableArray[hashedKeyIdx].getKey() == key) {
                return true;
            } else {
                Node<K, T> current = tableArray[hashedKeyIdx];
                while (current.next != null) {
                    if (current.next.getKey() == key) {
                        return true;
                    }
                    current = current.next;
                }
            }
        }
        return false;
    }
}
