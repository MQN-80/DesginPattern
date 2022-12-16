package SpecificationPattern;

import java.util.ArrayList;
import java.util.List;

public class clothes {
    List tags;
    clothes(){
        tags=new ArrayList<String>();
    }
    public clothes addTag(String tag){
        tags.add(tag);
        return this;
    }
    public void print(){
        for (Object s:tags) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
