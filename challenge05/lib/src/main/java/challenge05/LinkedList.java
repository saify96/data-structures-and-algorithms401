public class LinkedList {

    Node head;
    public void insert(int value){
        Node newItem = new Node(value);
        if(head==null){
            head = newItem;
        }else{
            newItem.next= head;
            head=newItem;
        }
    }
    public boolean includes(int value){
        Node current = head;
        while(current!=null){
            if(value==current.value){
                return true;
            }
            current=current.next;
        }
        return false;
    }
//    public static String toString(){
//        while(!=null){
//            System.out.print("{" + +"} -> ");
//        }
//   }


}

