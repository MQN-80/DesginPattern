package Builderpattern;

public class Ram {
    private final String RamVersion;

    public Ram(){
        this.RamVersion="入门级Ram";
    }

    public Ram(String CpuVersion) {
        this.RamVersion = CpuVersion;
    }

    public String getRamVersion() {
        return RamVersion;
    }
}
