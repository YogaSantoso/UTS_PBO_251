public class Rakitan {
    public static void main(String[] args) {
        INTEL intel = new INTEL(2);
        AMD amd = new AMD(3);
        Komputer komputer1 = new Komputer(intel);

        komputer1.CetakInfo();
        komputer1.mencabut(intel);
        komputer1.memasang(amd);
        komputer1.CetakInfo();
    }

}
