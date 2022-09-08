package parkir;

public class kendaraan {

    private String plat_nomor;
    private int biaya;

    public kendaraan() {
    }

    public kendaraan(String plat_nomor, int biaya) {
        this.plat_nomor = plat_nomor;
        this.biaya = biaya;
    }

    public String getPlat_nomor() {
        return plat_nomor;
    }

    public void setPlat_nomor(String plat_nomor) {
        this.plat_nomor = plat_nomor;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    @Override
    public String toString() {
        return "kendaraan{" + "plat_nomor=" + plat_nomor + '}';
    }

}
