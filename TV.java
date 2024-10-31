package Latihan8;

import Latihan8.Audible;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    // Konstruktor
    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    // Getter dan Setter untuk jenisLayar
    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    // Getter dan Setter untuk volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Implementasi abstract method dari AlatElektronik

    public void hidupkan() {
        System.out.println("TV dihidupkan.");
    }

    // Implementasi method dari interface Audible

    public void naikkanVolume(int increment) {
        this.volume += increment;
        System.out.println("Volume dinaikkan menjadi: " + this.volume);
    }

    public void turunkanVolume(int decrement) {
        this.volume -= decrement;
        if (this.volume < 0) {
            this.volume = 0;
        }
        System.out.println("Volume diturunkan menjadi: " + this.volume);
    }

    public String getInfo() {
        return super.getInfo() + ", Jenis Layar: " + jenisLayar + ", Volume: " + volume;
    }
}
