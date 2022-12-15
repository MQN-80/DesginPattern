package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Department extends Compoent {
    private List<Compoent> children;

    public Department(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void displayStructure(String indent) {
        // 输出部门名称
        System.out.println(indent + this.name);

        for (Compoent child: children) {
            // 添加缩进
            child.displayStructure(indent + "   ");
        }
    }

    public void add(Compoent c) {
        children.add(c);
    }

    public boolean remove(Compoent c) {
        return children.remove(c);
    }
}
