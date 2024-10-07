import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Object> animals;

    public Farm() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Object animal) {
        this.animals.add(animal);
    }

    public void printMovableAnimals() {
        for (Object animal : this.animals) {
            if (animal instanceof Pig) {
                Pig pig = (Pig) animal;
                System.out.println(pig.getName() + " can " + pig.move());
            } else if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                System.out.println(duck.getName() + " can " + duck.move());
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                System.out.println(fish.getName() + " can " + fish.move());
            }
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Pig("Pig1"));
        farm.addAnimal(new Duck("Duck1"));
        farm.addAnimal(new Fish("Fish1"));
        farm.addAnimal(new Pig("Pig2"));
        farm.addAnimal(new Duck("Duck2"));

        farm.printMovableAnimals();
    }
}