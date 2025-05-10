package UTS;

/**
 *
 * @author I Komang Agung Danutirta
 * NIM: 2301010259
 * Tgl 10 Mei 2025
 */
public class Matakuliah {
    private String kode;
    private String nama;

    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}