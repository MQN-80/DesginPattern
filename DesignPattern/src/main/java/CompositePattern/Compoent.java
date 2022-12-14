package CompositePattern;

// Compoent class
public abstract class Compoent {
    protected String name;
    public Compoent(String name) {
        this.name = name;
    }
    public abstract void displayStructure(String indent);
}

