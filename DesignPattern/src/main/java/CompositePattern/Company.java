package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Company extends Compoent {
    private List<Department> departments;

    public Company(String name) {
        super(name);
        this.departments = new ArrayList<>();
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + this.name);

        for (Department department: departments) {
            // 添加缩进
            department.displayStructure(indent + "   ");
        }
    }

    public void add(Department c) {
        departments.add(c);
    }

    public boolean remove(Department c) {
        return departments.remove(c);
    }
}
