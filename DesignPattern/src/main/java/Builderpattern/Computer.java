package Builderpattern;

public class Computer{
    private Cpu cpu;
    private Gpu gpu;
    private Ram ram;

    public Computer(Cpu cpu, Gpu gpu, Ram ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        System.out.println(this.toString());
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public Ram getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return  this.cpu.getCpuVersion()+"+"+
                this.gpu.getGpuVersion()+"+"+
                this.ram.getRamVersion();
    }
}
