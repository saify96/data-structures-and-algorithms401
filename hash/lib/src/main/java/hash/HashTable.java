package hash;

public class HashTable<T> {
    int size;
    Node[] tableArray;

    public HashTable(int size) {
        this.size = size;
        tableArray = new Node[this.size];
        for (int i = 0; i < tableArray.length; i++) {
            tableArray[i] = new Node();
        }
    }

    public int GetHash(String key) {
        int sumOfAscii = 0;
        for (int i = 0; i < key.length(); i++) {
            sumOfAscii += (int) key.charAt(i);
            System.out.println((int) key.charAt(i));
        }
        return (sumOfAscii * 599) % tableArray.length;
    }

    public void addToHashTable(String key, T value) {
        int hashedKey = GetHash(key);
        Node newItem = new Node(hashedKey, value);
    }
}
