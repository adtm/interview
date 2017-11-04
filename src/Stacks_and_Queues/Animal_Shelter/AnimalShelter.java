package Stacks_and_Queues.Animal_Shelter;

import java.util.LinkedList;

public class AnimalShelter {

    private int order = 0;
    private LinkedList<Dog> dogs = new LinkedList<Dog>();
    private LinkedList<Cat> cats = new LinkedList<Cat>();

    void enqueue(Animal a) {
        a.setNumber(order);
        order++;
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    Animal dequeueAny() {
        if (dogs.size() == 0) {
            return cats.peek();
        } else if (cats.size() == 0) {
            return dogs.peek();
        }

        Cat cat = cats.peek();
        Dog dog = dogs.peek();

        if (cat.isOlderThan(dog)) {
            return cat;
        } else {
            return dog;
        }
    }


    
}
