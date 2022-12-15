package CompositePattern;


public class Employee extends Compoent {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + this.name);
    }
}
