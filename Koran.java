package strukturdata;

public class Koran {
    private String nama;
    private String tglTerbit;

    // Konstruktor
    public Koran(String nama, String tglTerbit) {
        this.nama = nama;
        this.tglTerbit = tglTerbit;
    }

    public Koran() {

    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }
