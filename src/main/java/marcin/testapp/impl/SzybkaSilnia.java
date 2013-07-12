package marcin.testapp.impl;

import lombok.extern.slf4j.Slf4j;
import marcin.testapp.KalkulatorSilni;

/**
 *
 * @author mgr
 */
@Slf4j
public class SzybkaSilnia implements KalkulatorSilni{
    public long liczLong(long podstawa){
        if(podstawa<0) throw new ArithmeticException("podstawa silni nie może być mniejsza od zera");
        if(podstawa>0) return podstawa*liczLong(podstawa-1);
        return 1;
    }
    public String licz(int arg) {
        return ""+liczLong(arg);
    }
}
