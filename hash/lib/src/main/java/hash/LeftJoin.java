package hash;

import hash.*;

import java.util.*;

public class LeftJoin {
    public static void main(String[] args) {
        Hashtable hashTableTest = new Hashtable();
        hashTableTest.put("Mohammad", "Alsaify");
        hashTableTest.put("Mohammda", "Alsaify");
        hashTableTest.put("anas", "alramahi");
        hashTableTest.put("ibraheem", "dereni");
        Hashtable hashTableTest2 = new Hashtable();
        hashTableTest2.put("Mohammad", "Alsaify2");
        hashTableTest2.put("anas", "alramahi2");
        hashTableTest2.put("ibraheem", "dereni2");
        hashTableTest2.put("Mohammda", "majd");

        leftJoin(hashTableTest, hashTableTest2);
    }

    public static HashMap leftJoin(Hashtable left, Hashtable a) {
        HashMap<String, ArrayList<String>> leftJoinMap = new HashMap<>();

        Set<String> setOfKeys = left.keySet();
        for (String key : setOfKeys) {
            ArrayList<String> newArr = new ArrayList<>();
            newArr.add(key);
            newArr.add((String) left.get(key));
            newArr.add("NULL");
            leftJoinMap.put(key, newArr);
        }

        Set<String> setOfKeys2 = a.keySet();
        for (String key : setOfKeys2) {
            if (leftJoinMap.containsKey(key)) {
                leftJoinMap.get("00"+key);
                leftJoinMap.get(key).set(2, (String) a.get(key));
            }
        }
//        System.out.println(leftJoinMap);
        return leftJoinMap;
    }
}


//    public static void main(String[] args) {
//        HashTable hashTableTest = new HashTable(1024);
//        hashTableTest.addToHashTable("Mohammad", "Alsaify");
//        hashTableTest.addToHashTable("anas", "alramahi");
//        hashTableTest.addToHashTable("ibraheem", "dereni");
//        HashTable hashTableTest2 = new HashTable(1024);
//        hashTableTest2.addToHashTable("Mohammad", "Alsaify2");
//        hashTableTest2.addToHashTable("anas", "alramahi2");
////        hashTableTest2.addToHashTable("ibraheem", "dereni2");
//        leftJoin(hashTableTest, hashTableTest2);
//    }
//
//    public static void leftJoin(HashTable left, HashTable a) {
//        ArrayList<ArrayList> leftJoin = new ArrayList<>();
//        for (Node node : left.tableArray) {
//            if (node != null) {
//                ArrayList innerLL = new ArrayList<>();
//                innerLL.add(node.key);
//                innerLL.add(node.value);
//                innerLL.add("NULL");
//                leftJoin.add(innerLL);
//                for (Node nodeSec : a.tableArray) {
//                    if (nodeSec != null) {
//                        if (node.key.equals(nodeSec.key)) {
//                            innerLL.set(2, nodeSec.value);
////                            innerLL.add(nodeSec.value);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(leftJoin);
//    }


//                Node current = node;
//                while (current!=null){
//                    leftJoin.add(current.next.key);
//                    current=current.next;
//                }


//
//    HashTable hashTableTest = new HashTable(1024);
//        hashTableTest.addToHashTable("Mohammad", "Alsaify");
//                hashTableTest.addToHashTable("Mohammda", "Alsaify");
//                hashTableTest.addToHashTable("anas", "alramahi");
//                hashTableTest.addToHashTable("ibraheem", "dereni");
//                HashTable hashTableTest2 = new HashTable(1024);
//                hashTableTest2.addToHashTable("Mohammad", "Alsaify2");
//                hashTableTest2.addToHashTable("anas", "alramahi2");
//                hashTableTest2.addToHashTable("ibraheem", "dereni2");
//                leftJoin2(hashTableTest, hashTableTest2);
//                }
//
//public static void leftJoin2(HashTable left, HashTable a) {
//        HashMap<String,ArrayList> leftJoinMap = new HashMap<>();
//        for (Node node : left.tableArray) {
//        if (node != null) {
//        ArrayList<String> newArr = new ArrayList<>();
//        newArr.add((String) node.key);
//        newArr.add((String) node.value);
//        newArr.add("NULL");
//        leftJoinMap.put((String) node.key,newArr);
//        }
////            if (node.next!=null){
////                ArrayList<String> newArr = new ArrayList<>();
////                newArr.add((String) node.key);
////                newArr.add((String) node.value);
////                newArr.add("NULL");
////                leftJoinMap.put((String) node.key,newArr);
////            }
//        }
//        for (Node node : a.tableArray) {
//        if (node != null && leftJoinMap.containsKey(node.key)) {
//        leftJoinMap.get(node.key).set(2,node.value);
//        }
//
//        }
//        System.out.println(leftJoinMap);
//        }
//
//        }

//        left.forEach((k, v) ->
//                ArrayList<String> newArr = new ArrayList<>();
//
//        System.out.println("Key : " + k + ", Value : " + v)
//        );
