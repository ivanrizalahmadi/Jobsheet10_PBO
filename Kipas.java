package Latihan8;

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void hidupkan() {
        System.out.println("Kipas dihidupkan.");
    }

    public String getInfo() {
        return super.getInfo() + ", Jenis Kipas: " + jenis;
    }
}
