package com.mycompany.kalkulatordiskon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KalkulatorDiskon kalkulator = new KalkulatorDiskon();

        System.out.println("=== Kalkulator Diskon (Refactored) ===");

        System.out.print("Masukkan harga asli: ");
        double hargaAsli = scanner.nextDouble();

        System.out.print("Masukkan persentase diskon (%): ");
        double persentaseDiskon = scanner.nextDouble();

        double jumlahDiskon = kalkulator.hitungDiskon(hargaAsli, persentaseDiskon);
        double hargaAkhir = kalkulator.hitungHargaAkhir(hargaAsli, jumlahDiskon);

        System.out.println("-------------------------");
        System.out.printf("Jumlah Diskon: %.2f\n", jumlahDiskon);
        System.out.printf("Harga Akhir  : %.2f\n", hargaAkhir);
        System.out.println("=========================");

        scanner.close();
    }
}
