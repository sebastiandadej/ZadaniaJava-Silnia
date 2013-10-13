package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;




public class OptymalnaSilnia implements KalkulatorSilni{
    
    private static int MAKSYMALNY_ARGUMENT_DLA_LONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni i=null;
        //w zależności od rozmiaru argumentu powinniśmy użyć algorytmu SzybkaSilnia lub BigDecimalSilnia
        //TODO - zaimplementować to tutaj.
        return i.licz(podstawa);
    }
}
