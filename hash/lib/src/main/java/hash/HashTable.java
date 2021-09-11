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

//        public boolean contain(K key) {
//        return tableArray[GetHash(key)] != null ;
//    }

    public boolean contain(K key) {
        if (tableArray[GetHash(key)] != null) {
            if (tableArray[GetHash(key)].getKey().equals(key)) {
                return true;
            } else {
                Node<K, T> current = tableArray[GetHash(key)];
                while (current.next != null) {
                    if (current.next.getKey().equals(key)) {
                        return true;
                    }
                    current = current.next;
                }
            }
        }
        return false;
    }
}

//    public boolean contain(K key) {
//        return tableArray[GetHash(key)] != null && tableArray[GetHash(key)].getKey() == key;
//    }


//    public boolean contain(K key) {
//        if (tableArray[GetHash(key)] != null) {
//            if (tableArray[GetHash(key)].getKey() == key) {
//                return true;
//            } else {
//                Node<K, T> current = tableArray[GetHash(key)];
//                while (current.next != null) {
//                    if (current.next.getKey() == key) {
//                        return true;
//                    }
//                    current = current.next;
//                }
//            }
//        }
//        return false;
//    }


//    public String RepeatedWord(String sentence){
//        String[] sentenceWords = sentence.split(" ");
//        for (String word : sentenceWords) {
//            tableArray.add
//        }
//        if (hashTable.contains(word)) {
//            return word;
//        } else {
//            hashTable.add(word, word);
//        }
//
//
//    }
