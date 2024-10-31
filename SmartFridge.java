package Latihan8;

public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    // Konstruktor
    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    // Implementasi method dari interface Audible
    @Override
    public void naikkanVolume(int increment) {
        this.volume += increment;
        System.out.println("Volume SmartFridge dinaikkan menjadi: " + this.volume);
    }

    @Override
    public void turunkanVolume(int decrement) {
        this.volume -= decrement;
        if (this.volume < 0) {
            this.volume = 0;
        }
        System.out.println("Volume SmartFridge diturunkan menjadi: " + this.volume);
    }

    // Getter dan Setter untuk volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Implementasi method abstract dari kelas Kulkas
    @Override
    public void hidupkan() {
        System.out.println("Smart Fridge dihidupkan.");
    }
}
