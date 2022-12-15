package RegistryPattern;

public class Registry {
    protected String name;
    protected String type;

    public Registry(String name,String type) {
        this.name=name;
        this.type=type;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
}
