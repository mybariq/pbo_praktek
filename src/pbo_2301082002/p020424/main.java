/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p020424;

/**
 *
 * @author Bariq
 */
import java.util.Scanner;

class balok {
    private double panjang;
    private double tinggi;
    private double lebar;

    // Konstruktor
    public balok(double panjang, double tinggi, double lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    // Metode untuk menghitung luas alas
    public double hitungLuasAlas() {
        return panjang * lebar;
    }

    // Metode untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Metode untuk menghitung volume
    public double hitungVolume() {
        return panjang * tinggi * lebar; // Atau bisa menggunakan hitungLuasAlas() * tinggi
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang, tinggi, dan lebar balok:");
        double panjang = scanner.nextDouble();
        double tinggi = scanner.nextDouble();
        double lebar = scanner.nextDouble();

        Balok balok = new Balok(panjang, tinggi, lebar);

        System.out.println("Luas alas balok: " + balok.hitungLuasAlas());
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume balok: " + balok.hitungVolume());
    }
}