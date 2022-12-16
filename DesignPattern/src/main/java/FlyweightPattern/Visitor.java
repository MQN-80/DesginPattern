package FlyweightPattern;

public class Visitor {
    private String name;
    private Gender gender;

    public Visitor() {}

    public Visitor(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Visitor setName(String name) {
        this.name = name;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Visitor setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}

enum Gender {
    MALE,
    FEMALE;
    @Override
    public String toString() {
        return this == Gender.FEMALE ? "女" : "男";
    }
}
