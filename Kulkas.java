package Latihan8;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void hidupkan() {
        System.out.println("Kulkas dihidupkan.");
    }

    public String getInfo() {
        return super.getInfo() + ", Jumlah Pintu: " + jumlahPintu;
    }

}
