package com.mycompany.kalkulatordiskon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalkulatorDiskonTest {

    @Test
    public void testHitungDiskon() {
        KalkulatorDiskon kalkulator = new KalkulatorDiskon();
        double hargaAsli = 100000;
        double persentaseDiskon = 20;
        double expectedDiskon = 20000;
        
        assertEquals(expectedDiskon, kalkulator.hitungDiskon(hargaAsli, persentaseDiskon), 0.01);
    }

    @Test
    public void testHitungHargaAkhir() {
        KalkulatorDiskon kalkulator = new KalkulatorDiskon();
        double hargaAsli = 100000;
        double jumlahDiskon = 20000;
        double expectedHargaAkhir = 80000;
        
        assertEquals(expectedHargaAkhir, kalkulator.hitungHargaAkhir(hargaAsli, jumlahDiskon), 0.01);
    }
}
