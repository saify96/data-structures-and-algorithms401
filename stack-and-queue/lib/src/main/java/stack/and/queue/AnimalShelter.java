package stack.and.queue;

public class AnimalShelter {
    Queue<AnimalShelter> animalQueue = new Queue<>();

    public void animalEnqueue(AnimalShelter animal) {
        animalQueue.Enqueue(animal);
    }

    public void animalDequeue(String type) {
        while(animalQueue.front.toString()!=type){
            animalQueue.dequeue();
        }
        animalQueue.dequeue();
    }

}
