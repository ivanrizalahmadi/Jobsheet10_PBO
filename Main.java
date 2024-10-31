package Latihan8;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kipas
        Kipas kipas = new Kipas("Angin Duduk", 200000, "Putih", "Miyako");
        System.out.println(kipas.getInfo());

        // Membuat objek TV
        TV tv = new TV("LED", 10, 3000000, "Hitam", "LG");
        System.out.println(tv.getInfo());

        // Membuat objek Kulkas
        Kulkas kulkas = new Kulkas(2, 4000000, "Silver", "Samsung");
        System.out.println(kulkas.getInfo());

        // Membuat objek SmartFridge
        SmartFridge smartFridge = new SmartFridge(10, 2, 5000000, "Silver", "LG");
        System.out.println(smartFridge.getInfo());
    }
}
