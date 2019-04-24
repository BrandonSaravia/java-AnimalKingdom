package animalKingdom;

public class Mammals extends AbstractAnimals {
    private static int maxId = 0;
    private int id;

    public Mammals( String name, int yearDiscovered ) {
        super( name, yearDiscovered );
        maxId++;
        id = maxId;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    

}