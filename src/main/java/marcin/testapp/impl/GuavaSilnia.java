/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marcin.testapp.impl;

import com.google.common.math.BigIntegerMath;
import marcin.testapp.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author mgr
 */
public class GuavaSilnia implements KalkulatorSilni{

    public String licz(int arg) {
        return BigIntegerMath.factorial(arg).toString();
    }
    
}
