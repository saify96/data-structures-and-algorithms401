package hash;

public class Node<T> {
    int key;
    T value;
    Node next;

    public Node() {
    }

    public Node(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    //    public static int hash (String key){
//        int sumOfAscii=0;
//        for(int i=0; i<key.length(); i++)
//        {
//            sumOfAscii+=  (int)key.charAt(i);
//            System.out.println((int)key.charAt(i));
//        }
//        return  (sumOfAscii*599)%1024;
//    }



}
