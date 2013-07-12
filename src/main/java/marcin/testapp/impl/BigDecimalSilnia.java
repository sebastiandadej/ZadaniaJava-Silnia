package marcin.testapp.impl;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import marcin.testapp.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class BigDecimalSilnia implements KalkulatorSilni{
    public String licz(int arg) {
        //throw new NotImplementedException("nie zaimplementowane");
        return ""+arg;
    }
}
