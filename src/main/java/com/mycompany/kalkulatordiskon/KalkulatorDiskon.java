package com.mycompany.kalkulatordiskon;

public class KalkulatorDiskon {

    public double hitungDiskon(double hargaAsli, double persentaseDiskon) {
        return hargaAsli * (persentaseDiskon / 100);
    }

    public double hitungHargaAkhir(double hargaAsli, double jumlahDiskon) {
        return hargaAsli - jumlahDiskon;
    }
}
