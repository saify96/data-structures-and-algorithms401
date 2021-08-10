package stack.and.queue;

public class AnimalShelter<T> {
    Queue<Animal> animalQueue = new Queue<>();

    public void animalEnqueue(Animal animal) {
        animalQueue.Enqueue(animal);
    }

    public void animalDequeue(String type) {
        Queue<Animal> newAnimalQueue = new Queue<>();
        while (!animalQueue.front.value.getClass().getSimpleName().toLowerCase().equals(type) && animalQueue.front != null) {
            newAnimalQueue.Enqueue(animalQueue.dequeue());
        }
        animalQueue.dequeue();
        while (animalQueue.front != null) {
            newAnimalQueue.Enqueue(animalQueue.dequeue());
        }
        animalQueue.front = newAnimalQueue.front;
    }

    @Override
    public String toString() {
        Node current = animalQueue.front;
        String queue = "";
        queue = "FRONT -> ";
        while (current != null) {
            queue += "{" + current.value + "} -> ";
            current = current.next;
        }
        queue += "NULL";
        return queue;
    }

}


//
//package stack.and.queue;
//
//        import java.util.Locale;
//
//public class AnimalShelter<T> {
//    Queue<T> animalQueue = new Queue<>();
//
//    public void animalEnqueue(T animal) {
//        animalQueue.Enqueue(animal);
//    }
//
//    public T animalDequeue(String type) {
//        Queue<T> newAnimalQueue = new Queue<>();
////        if (type=="cat")
////            Cat catIns =new Cat();
//        while(animalQueue.front.value.toString()!=type && animalQueue.front!=null){
////        while(animalQueue.front.value.getClass().getSimpleName().toLowerCase()!=type && animalQueue.front!=null){
//            newAnimalQueue.Enqueue(animalQueue.dequeue());
//        }
//        T animal = animalQueue.dequeue();
//        while(animalQueue.front!=null){
//            newAnimalQueue.Enqueue(animalQueue.dequeue());
//        }
//        animalQueue.front=newAnimalQueue.front;
//        return animal;
//
//    }
//
//    @Override
//    public String toString() {
//        Node current = animalQueue.front;
//        String queue = "";
//        queue ="FRONT -> ";
//        while (current != null) {
//            queue += "{" + current.value+ "} -> ";
//            current = current.next;
//        }
//        queue += "NULL";
//        return queue;
//    }
//
//}
