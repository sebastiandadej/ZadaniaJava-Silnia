package marcin.testapp.impl;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import marcin.testapp.KalkulatorSilni;

/**
 *
 * @author mgr
 */
@Slf4j
public class BigDecimalSilnia implements KalkulatorSilni{
    public BigDecimal licz(BigDecimal podstawa){
        if(podstawa.compareTo(BigDecimal.ZERO)<0) throw new ArithmeticException("podstawa silni nie może być mniejsza od zera");
        if(podstawa.compareTo(BigDecimal.ZERO)>0) {
            return podstawa.multiply(licz(podstawa.subtract(BigDecimal.valueOf(1))));
        }
        return BigDecimal.ONE;
    }

    public String licz(int arg) {
        return licz(BigDecimal.valueOf(arg)).toString();
    }
}
