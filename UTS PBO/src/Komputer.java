public class Komputer {
    private CPU cpu;
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : "+this.cpu.getCPUdata()+" GHz"+" dipasang");
    }

    public void mencabut(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : "+this.cpu.getCPUdata()+" GHz"+" dicabut");
    }

    public void CetakInfo(){
        System.out.println("Spesifikasi : CPU : "+this.cpu.getCPUdata()+" GHz");
    }
}
