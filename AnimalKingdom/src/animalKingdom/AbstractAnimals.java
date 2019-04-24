package animalKingdom;

public abstract class AbstractAnimals {
    String name;
    int yearDiscovered;

    public AbstractAnimals( String name, int yearDiscovered ) {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }


    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();



    public String consumeFood() {
        return "they consume food";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public int getYearDiscovered() {
        return yearDiscovered;
    }
    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }


    @Override
    public String toString() {
        return "name = " + name + "\n" + "Year Named: " + yearDiscovered;
    }
}