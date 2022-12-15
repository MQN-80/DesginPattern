package Builderpattern;

public class Cpu {
    private final String CpuVersion;

    public Cpu(){
        this.CpuVersion="入门级Cpu";
    }

    public Cpu(String CpuVersion) {
        this.CpuVersion = CpuVersion;
    }

    public String getCpuVersion() {
        return CpuVersion;
    }
}
