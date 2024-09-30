public class Auto extends  Jarmu{
    private int kerekekszama;
    private int ajtokszama;

    public Auto(int loero, int vegsebesseg, String szin, int ajtokszama, int kerekekszama) {
        super(loero, vegsebesseg, szin);
        this.ajtokszama = ajtokszama;
        this.kerekekszama = kerekekszama;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kerekekszama=" + kerekekszama +
                ", ajtokszama=" + ajtokszama +
                ", szin='" + szin + '\'' +
                ", loero=" + loero +
                ", vegsebesseg=" + vegsebesseg +
                '}';
    }
}
