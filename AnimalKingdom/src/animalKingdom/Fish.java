package animalKingdom;

public class Fish extends AbstractAnimals {
    private static int maxId = 0;
    private int id;

    public Fish( String name, int yearDiscovered ) {
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
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    

}