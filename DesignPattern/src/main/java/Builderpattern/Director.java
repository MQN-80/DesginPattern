package Builderpattern;

public class Director {

    public void highComputer(Builder builder){
        builder.setCpu(new Cpu("高端Cpu"));
        builder.setGpu(new Gpu("高端Gpu"));
        builder.setRam(new Ram("高端Ram"));
    }

    public void lowComputer(Builder builder){
        builder.setCpu(new Cpu());
        builder.setGpu(new Gpu());
        builder.setRam(new Ram());
    }

    public void MiddleComputer(Builder builder){
        builder.setCpu(new Cpu("高端Cpu"));
        builder.setGpu(new Gpu());
        builder.setRam(new Ram());
    }
}
