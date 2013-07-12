/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marcin.testapp.impl;

import marcin.testapp.KalkulatorSilni;


/**
 *
 * @author mgr
 */
public class OptymalnaSilnia implements KalkulatorSilni{
    
    private static int MAKSYMALNY_ARGUMENT_DLA_LONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni i;
        if(podstawa>MAKSYMALNY_ARGUMENT_DLA_LONG) {
            i=new BigDecimalSilnia();
        } else {
            i=new SzybkaSilnia();
        }
        return i.licz(podstawa);
    }
}
