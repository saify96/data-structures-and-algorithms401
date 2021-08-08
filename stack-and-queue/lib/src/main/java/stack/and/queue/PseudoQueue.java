package stack.and.queue;

import java.util.EmptyStackException;

public class PseudoQueue<T> {
    Stack<T> firstStack = new Stack<>();
    Stack<T> secondStack = new Stack<>();

    public void pseudoEnqueue(T value) {
        firstStack.push(value);
    }

    public void pseudoDequeue() {
        while(firstStack.top!=null){
            secondStack.push(firstStack.pop());
        }
        secondStack.pop();
        while(secondStack.top!=null){
            firstStack.push(secondStack.pop());
        }
    }

    @Override
    public String toString() {
        Node current = firstStack.top;
        String pseudoQueue = "";
        pseudoQueue = "NULL";
        while (current != null) {
            pseudoQueue += " <- {" + current.value + "}";
            current = current.next;
        }
        pseudoQueue += " <- FRONT";
        return pseudoQueue;
    }

}


