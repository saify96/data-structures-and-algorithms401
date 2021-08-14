package stack.and.queue;

import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> top;

    public void push(T value) {
        Node<T> newItem = new Node<T>(value);
        if (top == null) {
            top = newItem;
            newItem.next = null;
        } else {
            newItem.next = top;
            top = newItem;
        }
    }

    public T pop() {
        Node<T> temp = null;
        if (top != null) {
            temp = top;
            top = top.next;
            temp.next = null;
            return temp.value;
        }
        throw new EmptyStackException();
    }

    public T peek() {
        if (!this.isEmpty()) {
            return top.value;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean validateBrackets(String string) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '(' || string.charAt(i) == '[') {
                charStack.push(string.charAt(i));
            } else if (string.charAt(i) == '}') {
                if (charStack.isEmpty()) {
                    return false;
                } else {
                    if (charStack.peek() == '{') {
                        charStack.pop();
                    }
                }
            } else if (string.charAt(i) == ')') {
                if (charStack.isEmpty()) {
                    return false;
                } else {
                    if (charStack.peek() == '(') {
                        charStack.pop();
                    }
                }
            } else if (string.charAt(i) == ']'){
                if (charStack.isEmpty()) {
                    return false;
                } else {
                    if (charStack.peek() == '[') {
                        charStack.pop();
                    }
                }
            }
            else if (string.charAt(i) != '}' || string.charAt(i) != ')' || string.charAt(i) != ']') {
                continue;
            }
        }
        if(charStack.isEmpty()){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        Node current = top;
        String stack = "";
        stack = ("TOP -> ");
        while (current != null) {
            stack += "{" + current.value + "} -> ";
            current = current.next;
        }
        stack += "NULL";
        return stack;
    }

}


//            if (charStack.isEmpty()){
//        return false;
//    }
//            if (string.charAt(i) == '}') {
//        if (charStack.peek() == '{')
//            charStack.pop();
//    }
//            if (string.charAt(i) == ')') {
//        if (charStack.peek() == '(')
//            charStack.pop();
//    }
//            if (string.charAt(i) == ']') {
//        if (charStack.peek() == '[')
//            charStack.pop();
//    }
//            if (string.charAt(i) != '}' || string.charAt(i) != ')' || string.charAt(i) != ']') {
//        continue;
//    } else {
//        return false;
//    }
//}
//        return false;


//    Stack<Character> charStack = new Stack<>();
//            for (int i = 0; i < string.length(); i++) {
//        if (string.charAt(i) == '{' || string.charAt(i) == '(' || string.charAt(i) == '[') {
//        charStack.push(string.charAt(i));
//        } else if (string.charAt(i) == '}' && charStack.peek() == '{' || string.charAt(i) == ')' && charStack.peek() == '(' || string.charAt(i) == ']' && charStack.peek() == '[') {
//        charStack.pop();
//        } else if (string.charAt(i) != '}' || string.charAt(i) != ')' || string.charAt(i) != ']') {
//        continue;
//        } else {
//        return false;
//        }
//        }
//        if (charStack.isEmpty()) {
//        return true;
//        }
//        return false;
