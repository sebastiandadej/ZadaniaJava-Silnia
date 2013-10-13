/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;

/**
 *
 * @author mgr
 */
public class KalkulatorSilniNieRekursywny implements KalkulatorSilni {

    public BigDecimal liczB(int podstawa) {
        if (podstawa < 0) {
            throw new ArithmeticException("podstawa silni nie może być mniejsza od zera");
        }
        BigDecimal wynik = new BigDecimal(1);
        if (podstawa > 0) {
            for (int i = 1; i <= podstawa; i++) {
                wynik = wynik.multiply(BigDecimal.valueOf(i));
            }
            return wynik;
        }
        return BigDecimal.ONE;
    }

    public String licz(int arg) {
        return liczB(arg).toString();
    }
}
