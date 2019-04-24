package animalKingdom;

public class Birds extends AbstractAnimals {
    private static int maxId = 0;
    private int id;

    public Birds( String name, int yearDiscovered ) {
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
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    

}