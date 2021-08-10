package stack.and.queue;


public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
