package Emo;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicker: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fride";
    }
}
