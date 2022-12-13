package Builderpattern;

public class ComputerBuilder implements Builder{
    private Cpu cpu;
    private Gpu gpu;
    private Ram ram;

    @Override
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Computer getMyComputer(){
        return new Computer(cpu, gpu, ram);
    }
}
