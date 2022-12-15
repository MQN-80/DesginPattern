package Builderpattern;

public class Gpu {
    private final String GpuVersion;

    public Gpu(){
        this.GpuVersion="入门级Gpu";
    }

    public Gpu(String CpuVersion) {
        this.GpuVersion = CpuVersion;
    }

    public String getGpuVersion() {
        return GpuVersion;
    }
}
