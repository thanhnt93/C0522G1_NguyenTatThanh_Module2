package ss7_abstract_class_interface.practice.class_animal_and_interface_edible.model.animal;

import ss7_abstract_class_interface.practice.class_animal_and_interface_edible.model.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
