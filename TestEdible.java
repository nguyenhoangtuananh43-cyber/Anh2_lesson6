package Emo;

public class TestEdible {
    public static void main(String[] args) {
        Animal[] animals = { new Chicken(), new Tiger() };

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Edible) {
                Edible edible = (Edible) animal;
                System.out.println("How to eat: " + edible.howToEat());
            }
        }

        Fruit[] fruits = { new Apple(), new Orange() };
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
