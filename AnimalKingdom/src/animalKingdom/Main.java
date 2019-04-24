package animalKingdom;

import java.util.ArrayList;

public class Main {

    public static void printAnimals(ArrayList<AbstractAnimals> animal, CheckAnimal tester) {
        for (AbstractAnimals v : animal) {
            if(tester.test(v)) {
                System.out.println(v.getName() + " " + v.getYearDiscovered());
            }
        }
    }

    public static void main(String[] args) {
        
        Mammals panda = new Mammals( "Panda", 1869);
        Mammals zebra = new Mammals( "Zebra", 1778);
        Mammals koala = new Mammals( "Koala", 1816);
        Mammals sloth = new Mammals( "Sloth", 1804);
        Mammals armadillo = new Mammals( "Armadillo", 1758);
        Mammals raccoon = new Mammals( "Raccoon", 1758);
        Mammals bigfoot = new Mammals( "Bigfoot", 2021);

        Birds pigeon = new Birds( "Pigeon", 1837);
        Birds peacock = new Birds( "Peacock", 1821);
        Birds toucan = new Birds( "Toucan", 1758);
        Birds parrot = new Birds( "Parrot", 1824);
        Birds swan = new Birds( "Swan", 1758);

        Fish salmon = new Fish( "Salmon", 1758);
        Fish catfish = new Fish( "Catfish", 1817);
        Fish perch = new Fish( "Perch", 1758);

        ArrayList<AbstractAnimals> animals = new ArrayList<AbstractAnimals>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println();
        System.out.println();
        System.out.println(" Animal List");
        System.out.println();

        System.out.println(animals.toString());

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 0");
        System.out.println();

        animals.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
        animals.forEach((v) -> System.out.println(v));

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 1");
        System.out.println();

        animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animals.forEach((v) -> System.out.println(v));

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 2");
        System.out.println();

        animals.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animals.forEach((v) -> System.out.println(v));

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 3");
        System.out.println();

        printAnimals(animals, v -> v.breath() == "lungs");

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 4");
        System.out.println();

        printAnimals(animals, v -> (v.breath() == "lungs") && (v.getYearDiscovered() == 1758));

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 5");
        System.out.println();

        printAnimals(animals, v -> (v.breath() == "lungs") && (v.reproduce() == "eggs"));

        System.out.println();
        System.out.println();
        System.out.println(" Lambda Expression 6");
        System.out.println();

        animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(animals, v -> (v.getYearDiscovered() == 1758));

        System.out.println();
        System.out.println();
        System.out.println(" Stretch");
        System.out.println();

        animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printAnimals(animals, a -> a instanceof Mammals);

        System.out.println();
        System.out.println();
    }
}