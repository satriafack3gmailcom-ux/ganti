package strukturdata;

public class Koran {
    private String nama;
    private String tglTerbit;

    public Koran() {
    }

    public Koran(String nama, String tglTerbit) {
        this.nama = nama;
        this.tglTerbit = tglTerbit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglTerbit() {
        return tglTerbit;
    }

    public void setTglTerbit(String tglTerbit) {
        this.tglTerbit = tglTerbit;
    }
}